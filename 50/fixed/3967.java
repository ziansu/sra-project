public static void main(java.lang.String[] args) throws java.io.IOException, java.lang.ClassNotFoundException {
    battleshipclient.Battleship_client obj = new battleshipclient.Battleship_client();
    java.net.InetAddress ip1 = java.net.InetAddress.getByName();
    battleshipclient.Battleship_client.IP.add(ip1);
    obj.doStuff();
}