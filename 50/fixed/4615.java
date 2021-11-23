private java.lang.String shutdownServer(java.lang.String password) {
    boolean bool = server.controller.Controller.shutdown(password);
    if (bool) {
        return "OK SHUTDOWN";
    }else {
        return "ERROR SERVER COULD NOT SHUTDOWN PASSWORD WRONG";
    }
}