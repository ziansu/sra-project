public void run() {
    network.ServerSocketCreator create = new network.ServerSocketCreator();
    java.lang.Thread serverSock = new java.lang.Thread(create);
    serverSock.start();
    java.util.Scanner read = new java.util.Scanner(java.lang.System.in);
    char input = 'N';
    java.lang.System.out.println("Would you like to stop the server? Y/N");
    input = read.nextLine().charAt(0);
    while (input != 'Y') {
        input = read.nextLine().charAt(0);
    } 
    read.close();
    create.terminate();
}