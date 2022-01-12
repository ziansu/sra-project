private void validateUser(java.lang.String username, java.lang.String password) {
    java.util.ArrayList<java.lang.String> userDetails = new java.util.ArrayList<java.lang.String>();
    userDetails.add(username);
    userDetails.add(password);
    client.control.Request request = new client.control.Request(common.enums.Command.LOGIN, userDetails);
    try {
        ClientConnectionController.clientConnect.controller = this;
        ClientConnectionController.clientConnect.sendToServer(request);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}