public java.lang.String executeRequest(java.lang.String command) {
    if (command.substring(0, 5).equals("LOGIN")) {
        if (checkLoginMessage(command)) {
            return "SUCCESSUSER";
        }else {
            return "FAILURE";
        }
    }
    return "INVALID";
}