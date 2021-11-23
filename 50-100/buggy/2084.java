@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if (0 == (java.lang.Integer.parseInt(textArea_message.getSize().toString()))) {
        return ;
    }
    forms.MessageObject mo = new forms.MessageObject();
    mo.code = 71;
    mo.info.text1 = conv_link;
    mo.info.text2 = new java.lang.String(textArea_message.getText());
    out.SendMessage(mo);
    textArea_message.setText("");
}