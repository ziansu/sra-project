@org.springframework.web.bind.annotation.RequestMapping(value = "/save", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String save(javax.servlet.http.HttpServletRequest request) {
    org.springframework.security.core.Authentication auth = org.springframework.security.core.context.SecurityContextHolder.getContext().getAuthentication();
    if (!(auth instanceof org.springframework.security.authentication.AnonymousAuthenticationToken)) {
        java.lang.System.out.println(auth.getName());
        java.lang.String url = endService.createXML(auth.getName(), request.getParameterMap());
        projectService.configProject(request.getParameter("data[idProject]"), url);
    }
    return "redirect:/end";
}