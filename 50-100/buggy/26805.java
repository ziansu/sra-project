public void register() {
    java.lang.System.out.print("Hostname of the server you want to connect to:");
    java.util.Scanner console = new java.util.Scanner(java.lang.System.in);
    host = console.next();
    java.lang.System.out.print("Port of the server to connect to:");
    serverPort = console.nextInt();
    console.nextLine();
    java.lang.System.out.print("Enter your name:");
    name = console.nextLine();
    myClientObject = new ClientObject(name, host, serverPort);
    java.lang.System.out.println("made client object");
    this.heartbeat();
}