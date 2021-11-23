@parking.controllers.RequestMapping(value = "/users/{username:.+}", method = RequestMethod.DELETE)
public void deleteUser(@parking.controllers.PathVariable(value = "username")
java.lang.String username, javax.servlet.http.HttpServletRequest request) throws parking.exceptions.ApplicationException {
    adminService.deleteUser(username, request);
}