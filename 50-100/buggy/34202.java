public java.lang.String login() {
    User loggedin = userManager.login(id, pass);
    if (loggedin != null) {
        rejected = false;
        setCurrentUser(loggedin);
        setFirstName(currentUser.getFirstName());
        setLastName(currentUser.getLastName());
        setEmail(currentUser.getEmail());
        setId(currentUser.getUsername());
        setPass(currentUser.getPassword());
        java.lang.System.out.println(currentUser.getUsername());
        return "loggedin";
    }
    rejected = true;
    return "index";
}