public boolean executeLogin(java.lang.String username, java.lang.String password) {
    try {
        if (model.loginUser(username, password)) {
            controller.Controller.logger.log(java.util.logging.Level.INFO, "Login success!");
            view.updateView(java.lang.String.format(Constants.MSG_LOGGEDIN, username));
            return true;
        }
        return false;
    } catch (Misc.RequestException e) {
        view.updateView(e.getMessage());
        return false;
    }
}