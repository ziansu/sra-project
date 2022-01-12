@java.lang.Override
public void run() throws java.lang.Exception {
    com.gargoylesoftware.htmlunit.WebClient webClient = context.getWebClient();
    if (webClient == null) {
        java.lang.System.out.println("You have not logged in yet!");
    }else {
        webClient.close();
        context.logout();
        java.lang.System.out.println("Successfully logged out!");
    }
}