public void initSocketConnection() throws java.io.IOException {
    try {
        java.net.Socket s = new java.net.Socket(address, port);
        dis = new java.io.DataInputStream(s.getInputStream());
        dos = new java.io.DataOutputStream(s.getOutputStream());
        new standard.lab9.ChatHandlerClientReadThread(dis, txtChatHistory).start();
    } catch (java.net.UnknownHostException e) {
        javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        dispose();
        e.printStackTrace();
    }
}