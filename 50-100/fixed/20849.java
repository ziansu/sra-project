@java.lang.Override
public void run() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder(beetracker.MessageDialogue.crashMsg[0]);
    builder.append(msg).append(beetracker.MessageDialogue.crashMsg[1]);
    javax.swing.JOptionPane.showMessageDialog(null, builder.toString(), "Fatal Error", javax.swing.JOptionPane.ERROR_MESSAGE);
    java.lang.System.exit(1);
}