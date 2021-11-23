@org.springframework.web.bind.annotation.RequestMapping(value = "/login", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String loginPost(@org.springframework.web.bind.annotation.RequestParam(value = "username", required = true)
java.lang.String username, @org.springframework.web.bind.annotation.RequestParam(value = "password", required = true)
java.lang.String password, org.springframework.ui.Model model) {
    cz.fi.muni.pa165.travelagency.mvc.controller.MainController.log.error("I was here");
    cz.fi.muni.pa165.travelagency.mvc.controller.MainController.log.error(username);
    cz.fi.muni.pa165.travelagency.mvc.controller.MainController.log.error(password);
    return "login";
}