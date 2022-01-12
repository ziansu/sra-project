@java.lang.Override
public void run() {
    com.github.dmtk.PingWindow p = new com.github.dmtk.PingWindow();
    p.setVisible(true);
    java.io.PrintStream printStream = new java.io.PrintStream(new com.github.dmtk.TextAreaOutputStream(p.getjTextArea1()));
    com.github.dmtk.Pinger.pingClient(printStream, switchIPTextField.getText());
}