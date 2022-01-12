@java.lang.Override
public void run() {
    try {
        while (true) {
            networking.Networking.connectiom = new java.net.Socket(java.net.InetAddress.getByName("127.0.0.1"), 5678);
            networking.Networking.output = new java.io.ObjectOutputStream(networking.Networking.connectiom.getOutputStream());
            networking.Networking.input = new java.io.ObjectInputStream(networking.Networking.connectiom.getInputStream());
            javax.swing.JOptionPane.showMessageDialog(null, networking.Networking.input.readObject());
        } 
    } catch (java.net.UnknownHostException e) {
    } catch (java.io.IOException e) {
    } catch (java.lang.ClassNotFoundException e) {
    }
}