@org.springframework.web.bind.annotation.RequestMapping(value = "add", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String add(org.springframework.ui.Model model, @org.springframework.web.bind.annotation.ModelAttribute
org.launchcode.models.User user, @org.springframework.web.bind.annotation.RequestParam
java.lang.String verify) {
    if (verify.equals(user.getPassword())) {
        model.addAttribute("title", "Add User");
        model.addAttribute("newUser", user.getUsername());
        model.addAttribute(user);
        org.launchcode.models.UserData.add(user);
        return "users/index";
    }else {
        model.addAttribute("title", "Add User");
        model.addAttribute("error", "Passwords do not match");
        model.addAttribute(user);
        return "users/add";
    }
}