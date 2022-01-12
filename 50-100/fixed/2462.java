public void disconnect() {
    try {
        clientSocket.close();
        javax.swing.JOptionPane.showMessageDialog(HumanClientGUIFrame, "Disconnected from Server, change port below");
        out.close();
        in.close();
        lt.interrupt();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}