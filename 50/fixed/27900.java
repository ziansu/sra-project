public static void main(java.lang.String[] args) throws java.io.IOException {
    new de.verbund.watten.server.WattenServer();
    java.lang.System.out.println("Server startup");
    java.lang.System.in.read();
    java.lang.System.out.println("Server shutdown");
    java.lang.System.exit(0);
}