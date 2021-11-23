@org.springframework.web.bind.annotation.GetMapping(value = "/")
public java.lang.String siteIndex(org.springframework.ui.Model model) {
    java.lang.Object user = org.springframework.security.core.context.SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    if (!(user instanceof com.simplesauce.models.User)) {
        com.simplesauce.models.User notLoggedInUser = new com.simplesauce.models.User();
        notLoggedInUser.setConfiguration(new com.simplesauce.models.SearchConfiguration());
        model.addAttribute("user", notLoggedInUser);
    }else {
        com.simplesauce.models.User loggedInUser = usersDao.findOne(((com.simplesauce.models.User) (user)).getId());
        model.addAttribute("user", loggedInUser);
    }
    return "nav/index";
}