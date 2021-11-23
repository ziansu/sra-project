@org.springframework.web.bind.annotation.RequestMapping(path = "/login", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String login(java.lang.String username, java.lang.String password, javax.servlet.http.HttpSession session) throws java.lang.Exception {
    com.theironyard.entities.User user = userRepo.findOneByName(username);
    if (user == null) {
        user = new com.theironyard.entities.User();
        user.name = username;
        user.password = com.theironyard.PasswordStorage.createHash(password);
        userRepo.save(user);
    }else
        if (!(com.theironyard.PasswordStorage.verifyPassword(password, user.password))) {
            throw new java.lang.Exception("Wrong password");
        }
    
    session.setAttribute("username", username);
    return "redirect:/";
}