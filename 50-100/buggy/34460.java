@org.springframework.web.bind.annotation.GetMapping(value = "/login")
public java.lang.String getLoginPage(org.springframework.ui.Model model, @org.springframework.web.bind.annotation.ModelAttribute(value = "loginForm")
by.epam.jmp.app.tradesystem.web.dto.LoginFormDTO loginFormDTO, @org.springframework.web.bind.annotation.RequestParam(required = false)
java.lang.String fail, @org.springframework.web.bind.annotation.RequestParam(required = false)
java.lang.String logout) {
    model.addAttribute("isFail", (fail != null));
    model.addAttribute("isLogout", (logout != null));
    model.addAttribute("loginForm", (loginFormDTO != null ? loginFormDTO : new by.epam.jmp.app.tradesystem.web.dto.LoginFormDTO()));
    return "login";
}