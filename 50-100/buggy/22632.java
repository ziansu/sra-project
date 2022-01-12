@org.springframework.web.bind.annotation.RequestMapping(value = { "/login" })
public java.lang.String mainPage(@org.springframework.web.bind.annotation.RequestParam(value = "error", required = false)
boolean error, @org.springframework.web.bind.annotation.RequestParam(value = "logout", required = false)
boolean logout, org.springframework.ui.ModelMap model) {
    if (com.bcbssc.post.controller.web.SessionController.log.isInfoEnabled())
        com.bcbssc.post.controller.web.SessionController.log.info("/login invoked.");
    
    if (logout)
        expireCache();
    
    if (error)
        model.addAttribute("error", "Sign in was unsuccessful. Try again.");
    else
        model.addAttribute("error", "");
    
    return "loginPage";
}