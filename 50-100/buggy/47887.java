private void whileChatting() throws java.io.IOException {
    ableToType(true);
    do {
        try {
            message = new clientSide.Message(input.readObject());
            showMessage(("\n" + (message)));
        } catch (java.lang.ClassNotFoundException classNotFoundException) {
            showMessage("\n I don\'t know that object type");
        }
    } while (!(message.getData().equals("SERVER - END")) );
}