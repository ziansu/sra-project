public java.lang.Object handleLogIn(java.lang.String username, java.lang.String password) {
    java.lang.String answer;
    loginfacade = new app.facades.LogInFacade();
    java.lang.Object answer;
    try {
        answer = ("Hi " + (loginfacade.handleLogIn(username, password).getUserID())) + " !";
    } catch (java.lang.Exception e) {
        answer = e;
    }
    return answer;
}