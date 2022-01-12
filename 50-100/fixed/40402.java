public static void main(java.lang.String[] args) {
    Server.Server s = new Server.Server();
    java.lang.System.out.println("Please provide path for where the Server will Read/Write: ");
    java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
    s.path = scanner.nextLine();
    java.lang.System.out.println(s.path);
    try {
        s.runServer();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    scanner.close();
}