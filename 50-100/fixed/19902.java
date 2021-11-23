public java.lang.String login() {
    model.User user = loginService.login(username, password);
    if (user != null) {
        session().setAttribute("user", user);
        return SUCCESS;
    }else {
        request().setAttribute("flag", "0");
        return INPUT;
    }
}