private void whileChatting() throws java.io.IOException {
    java.lang.String message = " You are now connected! ";
    sendMessage(message);
    ableToType(true);
    do {
        try {
            message = ((java.lang.String) (input.readObject()));
            showMessage(("\n" + message));
        } catch (java.lang.ClassNotFoundException classNotFoundException) {
            showMessage("\n Can\'t understand what that user sent!");
        }
    } while (!(message.equals("CLIENT - END")) );
}