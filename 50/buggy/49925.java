@it.sevenbits.FacultySite.web.controllers.RequestMapping(value = "/upload", method = RequestMethod.GET)
java.lang.String handleFileUpload() {
    if (!(org.springframework.security.core.context.SecurityContextHolder.getContext().getAuthentication().getName().equals("root")))
        return "redirect:/main";
    
    return "home/upload";
}