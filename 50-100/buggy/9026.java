private void createClient(java.lang.String email, java.lang.String name, java.lang.String password, java.lang.String address, java.lang.String birthdate, double posX, double posY) {
    Driver newClient = new Client(email, name, password, address, birthdate, posX, posY);
    this.clients.add(newClient);
}