public void reJoinView(java.lang.String user, java.lang.String pass) {
    if ((user != null) && (pass != null)) {
        checkUser = true;
    }
    rejoinUser = user;
    rejoinPass = pass;
    starter();
}