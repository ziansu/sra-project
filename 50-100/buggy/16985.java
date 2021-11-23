@org.springframework.web.bind.annotation.RequestMapping(value = "/api/coursera")
@org.springframework.web.bind.annotation.ResponseBody
java.lang.String tag(@org.springframework.web.bind.annotation.RequestParam(value = "nocCode")
java.lang.String noc) {
    if (noc.isEmpty()) {
        return "Pass 'nocCode' request parameter.";
    }
    java.lang.String result = "";
    if (com.niewlabs.careerpath.MainController.nocToCoursera.containsKey(noc)) {
        java.lang.String query = com.niewlabs.careerpath.MainController.nocToCoursera.get(noc).get(0);
    }
    try {
        result = sendGet(query);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return result;
}