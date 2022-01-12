@com.theironyard.controllers.RequestMapping(path = "/login", method = RequestMethod.POST)
public com.theironyard.entities.User login(@com.theironyard.controllers.RequestBody
com.theironyard.entities.User user, javax.servlet.http.HttpSession session) throws java.lang.Exception {
    if (com.theironyard.utils.PasswordStorage.verifyPassword(user.getPasswordHash(), users.findFirstByName(user.getName()).getPasswordHash())) {
        user = users.findOne(user.getId());
        session.setAttribute("user", user);
    }else {
        throw new java.lang.Exception("Incorrect Login Credentials");
    }
    return user;
}