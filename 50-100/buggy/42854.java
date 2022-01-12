protected void display() {
    int choice;
    java.lang.System.out.println("Transport Options");
    java.lang.System.out.println("Please enter your choice: ");
    java.lang.System.out.println();
    java.lang.System.out.println("1- Add an Outcoming Transport");
    java.lang.System.out.println("2- Add an Incoming Transport");
    java.lang.System.out.println("3- List of all Transports");
    java.lang.System.out.println("4- Back to Menu");
    java.lang.System.out.println();
    choice = Transport.PL.TransportMenu.in.nextInt();
    switch (choice) {
        case 1 :
            checkConditions();
            break;
        case 2 :
            addIncomingTransport();
            break;
        case 3 :
            listTransports();
            break;
        case 4 :
            mainTransport.displayMenu();
            break;
    }
}