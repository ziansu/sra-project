@gov.gwssi.csc.scms.controller.user.RequestMapping(value = "/role/{roleId}", method = RequestMethod.DELETE, headers = "Accept=application/json; charset=utf-8")
public java.util.Map<java.lang.String, java.lang.String> deleteRole(@gov.gwssi.csc.scms.controller.user.RequestHeader(value = gov.gwssi.csc.scms.controller.user.UserController.HEADER_AUTHORIZATION)
java.lang.String header, @gov.gwssi.csc.scms.controller.user.PathVariable
java.lang.String roleId) {
    try {
        gov.gwssi.csc.scms.controller.user.User user = userService.getRootUser(header);
        java.util.Map<java.lang.String, java.lang.String> result = roleService.deleteRole(roleId, user);
        return result;
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        throw new java.lang.RuntimeException(e);
    }
}