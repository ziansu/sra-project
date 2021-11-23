private void handleCommand(java.lang.String input) {
    switch (input) {
        case "q" :
            java.lang.System.gc();
            java.lang.System.exit(0);
            break;
        case "login" :
            this.hide();
            client.changeState(AgniClientView.NextState.LOGIN_VIEW);
            break;
        case "chat" :
            this.hide();
            client.changeState(AgniClientView.NextState.CHAT_VIEW);
            break;
        default :
            appendToOutputArea((("Unknown command \"" + input) + "\""));
            break;
    }
}