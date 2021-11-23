@org.springframework.web.bind.annotation.RequestMapping(value = "/main", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String mail(@org.springframework.web.bind.annotation.RequestParam(value = "user")
java.lang.String user, @org.springframework.web.bind.annotation.RequestParam(value = "pwd")
java.lang.String pwd, org.springframework.ui.Model model) {
    model.addAttribute("user", user);
    model.addAttribute("pwd", pwd);
    return "admin/main";
}