@java.lang.Override
public void modifyText(org.eclipse.swt.events.ModifyEvent e) {
    clearOutput();
    w = java.lang.Integer.parseInt(txt_winternitzP.getText());
    privateKey = "";
    publicKey = "";
    signature = "";
    setOutputs();
    instance.initB();
    getOutputs();
    updateLengths();
    setEnabled();
    btn_Sign.setEnabled(false);
    btn_VerifySig.setEnabled(false);
}