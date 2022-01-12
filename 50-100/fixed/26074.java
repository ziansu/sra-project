public void sentRequestToServer(com.javaOOPProject.client.Client c) throws java.io.IOException {
    this.socket = new java.net.Socket(java.net.InetAddress.getByName(host), port);
    oos = new java.io.ObjectOutputStream(socket.getOutputStream());
    java.lang.String temp = com.javaOOPProject.client.XMLManager.createXML(c);
    java.lang.System.out.println(temp);
    oos.writeObject(temp);
}