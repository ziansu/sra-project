@java.lang.Override
public void start() {
    java.lang.System.out.println(("visible " + (hasFocus())));
    this.setVisible(true);
    javax.swing.JOptionPane.showMessageDialog(null, "test");
    java.lang.System.out.println("udn dann");
}