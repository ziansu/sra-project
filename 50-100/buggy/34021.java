@java.lang.Override
public void modifyText(org.eclipse.swt.events.ModifyEvent e) {
    clearOutput();
    disable = false;
    message = txt_message.getText();
    messageHash = org.jcryptool.visual.wots.files.Converter._byteToHex(instance.hashMessage(message));
    b = org.jcryptool.visual.wots.files.Converter._byteToHex(instance.initB());
    txt_Hash.setText(messageHash);
    txt_Bi.setText(b);
    updateLengths();
    disable = true;
}