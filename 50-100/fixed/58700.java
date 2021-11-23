@org.springframework.web.bind.annotation.RequestMapping(value = "/getChartDataFields.do")
public java.util.List<java.util.Map<java.lang.String, java.lang.String>> getChartDataFields(javax.servlet.http.HttpServletRequest request, @org.springframework.web.bind.annotation.RequestParam(value = "type")
java.lang.String type) throws java.lang.Exception {
    java.lang.String userEmail = request.getRemoteUser();
    java.lang.String userId = userRepository.findByEmail(userEmail).getId();
    return chartService.getChartFields(type, userId);
}