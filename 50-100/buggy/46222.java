@site.fitify.controllers.GetMapping(value = "/stats/{id}")
public java.lang.String viewIndividualStats(@site.fitify.controllers.PathVariable
long id, org.springframework.ui.Model model) {
    site.fitify.models.MyStat myStat = myStatsDao.findOne(id);
    if (myStat == null) {
        return ("redirect:/stats/" + (userSvc.loggedInUser().getId())) + "/edit";
    }else {
        model.addAttribute("myStats", myStat);
    }
    site.fitify.models.User user = usersDao.findOne(id);
    model.addAttribute("user", user);
    return "stats/show";
}