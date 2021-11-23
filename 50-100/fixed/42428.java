private void whileChatting() throws java.io.IOException {
    serverSide.Message message = new serverSide.Message(" You are now connected! ");
    sendMessage(message);
    ableToType(true);
    do {
        try {
            message = new serverSide.Message(input.readObject());
            showMessage(("\n" + (message.getData())));
        } catch (java.lang.ClassNotFoundException classNotFoundException) {
            showMessage("\n Can\'t understand what that user sent!");
        }
    } while (!(message.getData().equals("CLIENT - END")) );
}