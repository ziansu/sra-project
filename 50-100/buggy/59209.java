@org.springframework.web.bind.annotation.RequestMapping(value = "/newTeam", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public org.springframework.web.servlet.View addTeam(org.springframework.ui.Model model, @org.springframework.web.bind.annotation.RequestParam
java.lang.String name, @org.springframework.web.bind.annotation.RequestParam
java.lang.String acronym, @org.springframework.web.bind.annotation.RequestParam
java.lang.String games, @org.springframework.web.bind.annotation.RequestParam
java.lang.String description) {
    com.dispute.team.Team team = new com.dispute.team.Team(name, acronym, description);
    com.dispute.user.User user = userRepository.findById(userComponent.getLoggedUser().getId());
    team.getAdmins().add(user);
    team.setCreator(userComponent.getLoggedUser());
    teamRepository.save(team);
    org.springframework.web.servlet.view.RedirectView rv = new org.springframework.web.servlet.view.RedirectView("teams.html");
    rv.setExposeModelAttributes(false);
    return rv;
}