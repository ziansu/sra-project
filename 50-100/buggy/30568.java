public static void main(java.lang.String[] args) throws java.lang.Exception {
    java.lang.System.setProperty("java.security.policy", "file:./security.policy");
    java.lang.System.setSecurityManager(new java.lang.SecurityManager());
    java.lang.System.setProperty("java.rmi.server.hostname", "127.0.0.1");
    java.lang.System.setProperty("java.rmi.server.codebase", "file:./bin/");
    application.view.ClientView view = new application.view.ClientView();
    view.lancer();
}