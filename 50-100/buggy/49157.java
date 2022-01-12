public static java.lang.String createUserHelp(com.revature.beans.User user, org.springframework.validation.BindingResult bindingResult, org.springframework.ui.ModelMap modelMap) {
    modelMap.addAttribute("User", user);
    if (bindingResult.hasErrors()) {
        return "index";
    }
    com.revature.dao.UserDAO uDao = new com.revature.dao.UserDAOimpl();
    uDao.createUser(user);
    modelMap.addAttribute("errorMessage", "tried to create(unprofessionally)");
    return "index";
}