@org.springframework.web.bind.annotation.ResponseBody
@org.springframework.web.bind.annotation.RequestMapping(value = "/identifyingcode")
public net.sf.json.JSONObject identifyingcode(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, javax.servlet.http.HttpSession session) {
    java.lang.String phoneNumber = org.apache.commons.lang3.StringUtils.trimToEmpty(request.getParameter("phone"));
    java.util.regex.Matcher matcher = com.lehealth.api.web.LoginController.phonePattern.matcher(phoneNumber);
    if (matcher.matches()) {
        java.lang.String ip = com.lehealth.util.Ipv4Util.getIp(request);
        com.lehealth.data.type.ErrorCodeType type = this.loginService.sendIdentifyingCode(phoneNumber, ip);
        return new com.lehealth.response.bean.BaseResponse(type).toJson();
    }else {
        return new com.lehealth.response.bean.BaseResponse(com.lehealth.data.type.ErrorCodeType.invalidPhoneNumber).toJson();
    }
}