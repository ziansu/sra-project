@org.springframework.web.bind.annotation.RequestMapping(value = "/userprofile/{id}")
public java.lang.String userProfile(org.springframework.ui.Model model, @org.springframework.web.bind.annotation.PathVariable
java.lang.Long id) {
    urteam.user.User user = userRepository.findOne(id);
    model.addAttribute("user", user);
    java.util.List<urteam.user.User> amigos = user.getFollowing();
    model.addAttribute("following", amigos);
    model.addAttribute("communities", user.getCommunityList());
    model.addAttribute("numberOfFollowers", user.getNumberOfFollower());
    return "user";
}