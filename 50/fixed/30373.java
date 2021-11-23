@com.cluster.controller.GetMapping(path = "/makeAdmin")
@com.cluster.controller.ResponseBody
public boolean makeUserAdmin(java.security.Principal principal, @com.cluster.controller.RequestParam
long userId) {
    return (userService.isUserActive(userId)) && (userService.setAdmin(userId, true));
}