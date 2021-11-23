@org.springframework.web.bind.annotation.RequestMapping(path = "/login", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String loginForm(com.theIronYard.bean.Login login, org.springframework.ui.Model model) {
    model.addAttribute("login", login);
    return "loginForm";
}