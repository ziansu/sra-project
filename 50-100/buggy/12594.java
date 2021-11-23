@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.String str = tfTxt.getText();
    taContent.setText(str);
    tfTxt.setText("");
    try {
        dos.writeUTF(str);
        dos.flush();
    } catch (java.io.IOException e1) {
        e1.printStackTrace();
    }
}