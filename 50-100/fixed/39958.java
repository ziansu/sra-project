@org.springframework.web.bind.annotation.RequestMapping(path = "/login", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String login(javax.servlet.http.HttpSession session, java.lang.String userName, java.lang.String password) throws java.lang.Exception {
    com.theironyard.entities.User user = users.findFirstByName(userName);
    if (user == null) {
        user = new com.theironyard.entities.User(userName, com.theironyard.utils.PasswordStorage.createHash(password));
        users.save(user);
    }else
        if (!(com.theironyard.utils.PasswordStorage.verifyPassword(password, user.getPasswordHash()))) {
            throw new java.lang.Exception("Incorrect password");
        }else {
            session.setAttribute("userName", userName);
        }
    
    return "redirect:/";
}