public void actionPerformed(java.awt.event.ActionEvent action) {
    if ((!("".equals(portTxtField.getText()))) && ((portTxtField.getText()) != null)) {
        java.lang.System.out.println(portTxtField.getText());
        cl.hcarrasco.remotecontrol.server.Start.port = java.lang.Integer.parseInt(portTxtField.getText());
    }
    if ((typeMessageSelector.getSelectedIndex()) == 0) {
        cl.hcarrasco.remotecontrol.msghandler.MsgHandler.messageShowing = "voice";
    }else
        if ((typeMessageSelector.getSelectedIndex()) == 1) {
            cl.hcarrasco.remotecontrol.msghandler.MsgHandler.messageShowing = "text-notification";
        }
    
}