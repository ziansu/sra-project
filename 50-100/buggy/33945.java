@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.String str = tfTxt.getText();
    taContent.setText(str);
    tfTxt.setText("");
    java.io.DataOutputStream dos;
    try {
        dos = new java.io.DataOutputStream(s.getOutputStream());
        dos.writeUTF(str);
        dos.flush();
        dos.close();
    } catch (java.io.IOException e1) {
        e1.printStackTrace();
    }
}