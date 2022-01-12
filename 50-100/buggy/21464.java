@org.springframework.web.bind.annotation.GetMapping(value = "/")
public java.lang.String siteIndex(org.springframework.ui.Model model) {
    com.simplesauce.models.User user = ((com.simplesauce.models.User) (org.springframework.security.core.context.SecurityContextHolder.getContext().getAuthentication().getPrincipal()));
    com.simplesauce.models.User loggedInUser = usersDao.findOne(user.getId());
    if (!(user instanceof com.simplesauce.models.User)) {
        com.simplesauce.models.User notLoggedInUser = new com.simplesauce.models.User();
        notLoggedInUser.setConfiguration(new com.simplesauce.models.SearchConfiguration());
        model.addAttribute("user", notLoggedInUser);
    }else {
        model.addAttribute("user", loggedInUser);
    }
    return "nav/index";
}