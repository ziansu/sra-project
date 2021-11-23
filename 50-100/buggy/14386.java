public result.LoginResult login(request.LoginRequest request) {
    boolean success = serverModel.login(request.getUserName(), request.getPassword());
    if (success == true) {
        return new result.LoginResult(true, "login success!");
    }else {
        return new result.LoginResult(false, "login failed.");
    }
}