@org.springframework.web.bind.annotation.RequestMapping(value = "/reikningur/breyta-nafni", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String renderUsernameChange(javax.servlet.http.HttpSession session, org.springframework.ui.ModelMap model) {
    model.addAttribute("form_switch", "username");
    model.addAttribute("username", ((java.lang.String) (session.getAttribute("username"))));
    return "account";
}