@com.cluster.controller.GetMapping(path = "/getUserInformation")
@com.cluster.controller.ResponseBody
public com.cluster.service.User getUserInformation(java.security.Principal principal, @com.cluster.controller.RequestParam
long userId) {
    if (userService.isAdmin(java.lang.Long.parseLong(principal.getName()))) {
        return adminService.getUserInformation(userId);
    }
    return null;
}