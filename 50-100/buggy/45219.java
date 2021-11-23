private void cancelConnection() {
    connecting = false;
    if ((GlobalData.client) != null)
        GlobalData.client.disconnect("Connecting cancelled");
    
    if ((GlobalData.server) != null)
        GlobalData.server.stop();
    
    resetForms();
    if ((connectedFrom) == null) {
        mainForm.setActive(true);
    }else {
        gfx.forms.Form form = formManager.getForm(connectedFrom);
        if (form != null)
            form.setActive(true);
        else
            mainForm.setActive(true);
        
    }
}