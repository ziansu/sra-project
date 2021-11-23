@com.togather.controllers.GetMapping(value = "/groups/{id}/details")
public java.lang.String getGroupDetails(@com.togather.controllers.PathVariable(name = "id")
long id, org.springframework.ui.Model model) {
    java.lang.Iterable<com.togather.models.User> members = groupsDao.findOne(id).getMembers();
    model.addAttribute("id", id);
    model.addAttribute("members", members);
    model.addAttribute("searchResults", null);
    return "/groups/details";
}