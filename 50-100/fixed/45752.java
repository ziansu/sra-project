@org.springframework.web.bind.annotation.RequestMapping(value = "/lectures", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String getClasses(org.springframework.ui.Model model, javax.servlet.http.HttpServletRequest request) {
    if ((request.getParameter("path")) != null) {
        java.lang.Integer idCourse = java.lang.Integer.parseInt(request.getParameter("path"));
        request.getSession().setAttribute("ActiveCourse", idCourse);
    }
    if (canCreate(request))
        model.addAttribute("canCreate", true);
    
    model.addAttribute("lecture", new it.unical.classmanager.model.data.Lecture());
    return getLectures(model, request);
}