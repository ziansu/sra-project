@java.lang.Override
public void run() {
    java.security.Policy.setPolicy(new plugin.PluginPolicy());
    java.lang.System.setSecurityManager(new java.lang.SecurityManager());
    javax.swing.JFrame window = new pkgnew.line.MainWindow();
    window.setExtendedState(((window.getExtendedState()) | (javax.swing.JFrame.MAXIMIZED_BOTH)));
    window.setVisible(true);
}