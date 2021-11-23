@com.theironyard.controllers.RequestMapping(path = "/create-user", method = RequestMethod.POST)
public com.theironyard.entities.User createUser(@com.theironyard.controllers.RequestBody
com.theironyard.entities.User newUser, javax.servlet.http.HttpSession session) throws java.lang.Exception {
    com.theironyard.entities.User user = users.findByUserName(newUser.getUserName());
    if (user == null) {
        user = new com.theironyard.entities.User(newUser.getUserName(), com.theironyard.utils.PasswordStorage.createHash(newUser.getPasswordHash()));
        users.save(user);
        session.setAttribute("userName", user.getUserName());
    }else {
        throw new java.lang.Exception("Username already taken.");
    }
    return user;
}