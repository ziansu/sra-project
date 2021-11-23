@org.springframework.web.bind.annotation.RequestMapping(value = "/gantt/load", method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String loadGantt(javax.servlet.http.HttpServletRequest request, java.security.Principal principal) {
    java.lang.String json = null;
    try {
        java.lang.String projectId = fr.projecthandler.util.Utilities.getRequestParameter(request, "projectId");
        if (projectId != null)
            json = ganttService.load(java.lang.Long.parseLong(projectId));
        
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return json;
}