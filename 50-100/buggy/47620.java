private void nameDialog() throws java.io.IOException {
    name = javax.swing.JOptionPane.showInputDialog("Name: ");
    java.lang.System.out.println(name);
    if (name.isEmpty()) {
        nameDialog();
    }else {
        msg = ("0:SERVER:" + (name)) + ": Hallo\n";
        s.getOutputStream().write(msg.getBytes());
    }
    setTitle((("Chat [" + (name)) + "]"));
}