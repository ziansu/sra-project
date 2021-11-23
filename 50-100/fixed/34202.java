public java.lang.String login() {
    currentUser = userManager.login(id, pass);
    if ((currentUser) != null) {
        rejected = false;
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