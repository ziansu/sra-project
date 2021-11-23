@org.springframework.web.bind.annotation.RequestMapping(value = "/getChartDataFields.do")
public java.lang.String getChartDataFields(javax.servlet.http.HttpServletRequest request, @org.springframework.web.bind.annotation.RequestParam(value = "type")
java.lang.String type) {
    java.lang.String jsonString;
    try {
        java.lang.String userEmail = request.getRemoteUser();
        java.lang.String userId = userRepository.findByEmail(userEmail).getId();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> out = chartService.getChartFields(type, userId);
        jsonString = new com.google.gson.Gson().toJson(out);
    } catch (java.lang.Exception e) {
        jsonString = pf.web.RestLib.getErrorString(e);
    }
    return jsonString;
}