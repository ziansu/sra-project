@org.springframework.web.bind.annotation.RequestMapping(value = "/friends", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String addFriend(java.security.Principal principal, @org.springframework.web.bind.annotation.RequestParam(value = "id")
java.lang.Long id) {
    java.lang.String username = principal.getName();
    com.jennbowers.library.models.User toUser = userRepo.findByUsername(username);
    com.jennbowers.library.models.User fromUser = userRepo.findOne(id);
    com.jennbowers.library.models.FriendRequest friendRequest = new com.jennbowers.library.models.FriendRequest();
    friendRequest.setTouser(toUser);
    friendRequest.setFromuser(fromUser);
    friendRequest.setActive(false);
    friendRequest.setPending(true);
    friendRequestRepo.save(friendRequest);
    return "friendAll";
}