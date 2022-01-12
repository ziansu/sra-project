private void addClient() throws java.io.IOException {
    java.lang.String name;
    java.lang.String address;
    java.lang.String phoneNumber;
    java.lang.System.out.println();
    java.lang.System.out.print("Name:");
    name = userInput.readLine();
    java.lang.System.out.print("Address:");
    address = userInput.readLine();
    java.lang.System.out.print("Phone number:");
    phoneNumber = userInput.readLine();
    java.lang.System.out.println();
    client = new Client(Client.createClientID(), name, address, phoneNumber);
    theater.addClient(client);
}