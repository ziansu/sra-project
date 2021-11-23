@java.lang.Override
public void windowClosing(java.awt.event.WindowEvent arg0) {
    client.getGUI().removePGUI(this.conn.other);
    this.conn.stop();
}