public static void main(java.lang.String[] args) {
    ClientInterface cl = new ClientInterface();
    ClientInterface.IPAddress = javax.swing.JOptionPane.showInputDialog(ClientInterface.frame, "Please enter the IP address of server:", null);
    ClientInterface.shop = new Shop(ClientInterface.userName);
    ClientInterface.userName = javax.swing.JOptionPane.showInputDialog(ClientInterface.frame, "What is your name?", null);
    ClientInterface.shop = new Shop(ClientInterface.userName);
}