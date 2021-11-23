@org.springframework.web.bind.annotation.RequestMapping(value = "/signup")
public java.lang.String formNewUser(org.springframework.ui.Model model) {
    if (!(model.containsAttribute("user"))) {
        model.addAttribute("user", new com.teamtreehouse.domain.User());
    }
    return "signup";
}