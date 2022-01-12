@com.luxoft.wheretogo.controller.RequestMapping(value = "/userInfo", method = RequestMethod.GET)
public com.luxoft.wheretogo.controller.UserInfo getUserInfo(java.security.Principal principal) {
    com.luxoft.wheretogo.controller.User user = usersService.findByEmail(principal.getName());
    return new com.luxoft.wheretogo.controller.UserInfo(user.getRole(), user.getEmail(), user.getFirstName(), user.getLastName(), user.isActive(), user.getPicture());
}