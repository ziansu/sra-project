public static void main(java.lang.String[] args) {
    clientSide.Client client;
    clientSide.Login login;
    client = new clientSide.Client("127.0.0.1");
    client.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    client.startRunning();
}