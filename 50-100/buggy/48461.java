@org.springframework.web.bind.annotation.RequestMapping(value = "/wx", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public com.starsea.im.aggregation.util.ServiceResult verifyWeixin(javax.servlet.http.HttpServletRequest req) {
    java.lang.String signature = req.getParameter("signature");
    java.lang.String timestamp = req.getParameter("timestamp");
    java.lang.String nonce = req.getParameter("nonce");
    java.lang.String echostr = req.getParameter("echostr");
    if (com.starsea.im.aggregation.util.CheckUtil.checkSignature(signature, timestamp, nonce)) {
        return setResponseData(echostr);
    }
    return setResponseData(false);
}