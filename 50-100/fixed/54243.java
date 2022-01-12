@com.theironyard.controllers.RequestMapping(path = "/users/{id}", method = RequestMethod.DELETE)
public void deleteUserDeniedByAdmin(@com.theironyard.controllers.PathVariable(value = "id")
int id, javax.servlet.http.HttpSession session) throws java.lang.Exception {
    java.lang.String userName = ((java.lang.String) (session.getAttribute("userName")));
    com.theironyard.entities.User user = users.findByUserName(userName);
    if ((!(user.getUserType().equals("Admin"))) || (!(user.getValid()))) {
        throw new java.lang.Exception("Cannot Delete this User");
    }
    users.delete(id);
}