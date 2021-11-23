@java.lang.Override
public void windowClosing(java.awt.event.WindowEvent e) {
    chat_client.Client.disconnect();
    java.lang.System.exit(0);
}