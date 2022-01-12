public void sentRequestToServer(com.javaOOPProject.client.Client c) throws java.io.IOException {
    this.socket = new java.net.Socket(java.net.InetAddress.getByName(host), port);
    oos = new java.io.ObjectOutputStream(socket.getOutputStream());
    oos.writeObject(com.javaOOPProject.client.XMLManager.createXML(c));
}