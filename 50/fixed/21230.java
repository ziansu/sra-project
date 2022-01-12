private void join() {
    java.lang.String host = javax.swing.JOptionPane.showInputDialog(frame, "IP:", "Join", javax.swing.JOptionPane.QUESTION_MESSAGE);
    if ((host != null) && (!(host.isEmpty()))) {
        join(host);
    }
}