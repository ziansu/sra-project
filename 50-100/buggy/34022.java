@org.springframework.web.bind.annotation.RequestMapping(value = "/gantt/load", method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.Object loadGantt(javax.servlet.http.HttpServletRequest request, java.security.Principal principal) {
    com.google.gson.JsonElement jsonElement = null;
    try {
        java.lang.String projectId = fr.projecthandler.util.Utilities.getRequestParameter(request, "projectId");
        if (projectId != null) {
            java.lang.String json = ganttService.load(java.lang.Long.parseLong(projectId));
            jsonElement = new com.google.gson.JsonParser().parse(json);
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return jsonElement;
}