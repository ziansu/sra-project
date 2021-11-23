public int doLogout() {
    com.jforex.dzjforex.ZorroBridge.logger.info("Logout called");
    return ZorroReturnValues.LOGOUT_OK.getValue();
}