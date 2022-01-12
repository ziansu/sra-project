public void terminateConnection() throws java.io.IOException {
    out.println("CONNTERM");
    java.lang.System.out.println("Closing connection to the server");
    s.close();
}