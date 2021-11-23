@gov.gwssi.csc.scms.controller.user.RequestMapping(value = "/node/{nodeId}", method = RequestMethod.DELETE, headers = "Accept=application/json; charset=utf-8")
public java.util.Map<java.lang.String, java.lang.String> deleteNode(@gov.gwssi.csc.scms.controller.user.RequestHeader(value = gov.gwssi.csc.scms.controller.user.UserController.HEADER_AUTHORIZATION)
java.lang.String header, @gov.gwssi.csc.scms.controller.user.PathVariable
java.lang.String nodeId) {
    try {
        gov.gwssi.csc.scms.controller.user.User user = userService.getRootUser(header);
        java.util.Map<java.lang.String, java.lang.String> result = nodeService.deleteNodeByNodeId(nodeId, user);
        return result;
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        throw new java.lang.RuntimeException(e);
    }
}