public void disconnect() {
    try {
        javax.swing.JOptionPane.showMessageDialog(HumanClientGUIFrame, "Disconnected from Server, change port below");
        clientSocket.close();
        out.close();
        in.close();
        lt.interrupt();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}