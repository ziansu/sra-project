@org.springframework.web.bind.annotation.RequestMapping(value = "/zendesk/sso/logout")
@org.springframework.web.bind.annotation.ResponseBody
public java.util.Map<java.lang.String, java.lang.Object> logout(@org.springframework.web.bind.annotation.RequestParam(name = "return_to", required = false)
java.lang.String returnTo) {
    log.info("/zendesk/sso?return_to={}", returnTo);
    java.util.Map<java.lang.String, java.lang.Object> result = new java.util.HashMap<>();
    result.put("return_to", result);
    return result;
}