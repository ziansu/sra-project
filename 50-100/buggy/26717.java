@gov.gwssi.csc.scms.controller.user.RequestMapping(value = "/role/{roleId}", method = RequestMethod.DELETE, headers = "Accept=application/json; charset=utf-8")
public gov.gwssi.csc.scms.controller.user.Role deleteRole(@gov.gwssi.csc.scms.controller.user.RequestHeader(value = gov.gwssi.csc.scms.controller.user.UserController.HEADER_AUTHORIZATION)
java.lang.String header, @gov.gwssi.csc.scms.controller.user.PathVariable
java.lang.String roleId) {
    try {
        gov.gwssi.csc.scms.controller.user.User user = userService.getRootUser(header);
        return roleService.deleteRole(roleId, user);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        throw new java.lang.RuntimeException(e);
    }
}