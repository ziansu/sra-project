public java.lang.String execute() {
    if (loginService.login(username, password)) {
        return "success";
    }else {
        return "fail";
    }
}