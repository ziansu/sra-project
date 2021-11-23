public static void main(java.lang.String[] args) {
    javafx.application.Application.launch(args);
    core.Login login = new core.Login();
    if (login.validateAttempt("OldBoiSmokey", "abc123")) {
        java.lang.System.out.println("You are logged in");
        core.Session session = new core.Session("OldBoiSmokey");
    }else {
        java.lang.System.out.println("Login attempt failed");
    }
}