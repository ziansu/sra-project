@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if (textArea_message.getText().equals("")) {
        return ;
    }
    forms.MessageObject mo = new forms.MessageObject();
    mo.code = 71;
    mo.info.text1 = conv_link;
    mo.info.text2 = textArea_message.getText();
    out.SendMessage(mo);
    textArea_message.setText("");
}