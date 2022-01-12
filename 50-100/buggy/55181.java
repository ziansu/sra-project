@org.springframework.web.bind.annotation.ResponseBody
@org.springframework.web.bind.annotation.RequestMapping(value = "/resetLoginUserPwd", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public com.cidic.design.model.ResultModel resetLoginUserPwd(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, @org.springframework.web.bind.annotation.RequestParam
java.lang.String email, @org.springframework.web.bind.annotation.RequestParam
java.lang.String newPwd) {
    resultModel = new com.cidic.design.model.ResultModel();
    try {
        userServiceImpl.resetLoginUserPwd(email, newPwd);
        resultModel.setResultCode(200);
        resultModel.setSuccess(true);
        return resultModel;
    } catch (java.lang.Exception e) {
        throw new com.cidic.design.exception.DCException(500, "修改出错");
    }
}