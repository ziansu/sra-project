public static void main(java.lang.String[] args) {
    BotMain.client_id = BotMain.readStuff("stuff2.gitignore");
    BotMain.token = BotMain.readStuff("stuff.gitignore");
    try {
        JDA builder = new JDABuilder().setBotToken(BotMain.token).addListener(new MessageListener()).buildBlocking();
    } catch (java.lang.IllegalArgumentException e) {
        java.lang.System.out.println("The config was not populated. Please enter a bot token.");
    } catch (javax.security.auth.login.LoginException e) {
        java.lang.System.out.println("The provided bot token was incorrect. Please provide valid details.");
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}