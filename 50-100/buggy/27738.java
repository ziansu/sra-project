@org.springframework.web.bind.annotation.RequestMapping(value = "/validateJsonResponse")
public java.lang.String validateJsonResponse(@org.springframework.web.bind.annotation.RequestBody
java.lang.String requestString, javax.servlet.http.HttpServletRequest req) throws java.io.UnsupportedEncodingException {
    java.lang.System.out.println("At deocdeJsonResponse endpoint.");
    java.lang.System.out.println(("RequestString: " + requestString));
    java.lang.String jsonResponse = java.net.URLDecoder.decode(requestString, "UTF-8");
    jsonResponse = requestString.replace("hppResponse=", "");
    java.lang.System.out.println(("JsonResponse: " + jsonResponse));
    return payService.validateJsonResponse(jsonResponse) ? "true" : "false";
}