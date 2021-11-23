public java.lang.String login() {
    java.lang.System.out.println(username);
    java.lang.System.out.println(password);
    model.User user = loginService.login(username, password);
    if (user != null) {
        session().setAttribute("user", user);
        java.lang.System.out.println(username);
        return SUCCESS;
    }else {
        java.lang.System.out.println("wwrong");
        request().setAttribute("flag", "0");
        return INPUT;
    }
}