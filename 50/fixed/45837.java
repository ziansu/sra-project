public java.lang.String getUserLogoutMsg() {
    java.lang.String msg;
    if (logoutMsg.isEmpty()) {
        msg = "Goodbye!";
    }else {
        msg = logoutMsg;
    }
    return msg;
}