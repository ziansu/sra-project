public boolean isInput() {
    boolean valid = false;
    try {
        valid = ((validInput = in.readLine()) != null) ? true : false;
    } catch (java.io.IOException e) {
        sendCommandText((((communication.ClientHandler.Key.WARNING) + " ") + "there's nothing to read here!"));
    }
    return valid;
}