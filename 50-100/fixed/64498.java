public java.lang.String[] getClientNames() {
    Services.UserService userService = new Services.UserService();
    java.util.ArrayList<Models.User> clients = userService.getClients();
    java.util.ArrayList<java.lang.String> clientNames = new java.util.ArrayList<java.lang.String>();
    for (Models.User client : clients) {
        clientNames.add(((client.getFirstName()) + (client.getLastName())));
    }
    return clientNames.toArray(new java.lang.String[0]);
}