@com.theironyard.controllers.RequestMapping(path = "/login", method = RequestMethod.POST)
public com.theironyard.entities.User login(@com.theironyard.controllers.RequestBody
com.theironyard.entities.User assumedUser, javax.servlet.http.HttpSession session) throws java.lang.Exception {
    com.theironyard.entities.User user = users.findByUserName(assumedUser.getUserName());
    if (user == null) {
        throw new java.lang.Exception("Username does not exist.");
    }else
        if (!(com.theironyard.utils.PasswordStorage.verifyPassword(assumedUser.getPasswordHash(), user.getPasswordHash()))) {
            throw new java.lang.Exception("Invalid password!");
        }
    
    session.setAttribute("userName", user.getUserName());
    return user;
}