@com.cluster.controller.GetMapping(path = "/makeAdmin")
@com.cluster.controller.ResponseBody
public boolean makeUserAdmin(java.security.Principal principal, @com.cluster.controller.RequestParam
long userId) {
    if (userService.isUserActive(userId)) {
        return userService.setAdmin(userId, true);
    }
    return false;
}