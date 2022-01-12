@org.springframework.web.bind.annotation.RequestMapping(value = { "/" , "/login" }, method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String login(org.springframework.ui.Model model, @org.springframework.web.bind.annotation.RequestParam(value = "error", required = false)
java.lang.String error, @org.springframework.web.bind.annotation.RequestParam(value = "logout", required = false)
java.lang.String logout) {
    if (error != null) {
        model.addAttribute("error", "Virheellinen käyttäjänimi tai salasana.");
    }
    if (logout != null) {
        activeTask = 0;
        editingActive = 0;
        startup = true;
        activeTab = 0;
        model.addAttribute("msg", "Olet kirjautunut ulos.");
    }
    bean.User user = new bean.User("", "");
    model.addAttribute("user", user);
    return "login";
}