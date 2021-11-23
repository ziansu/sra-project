public void setPin(java.lang.String pin, java.lang.Boolean value) {
    if (pin == "2") {
    }
    ca.syncron.app.service.SyncronService.client.sendDigitalMessage(pin, (value ? "1" : "0"));
    java.lang.String m = (value) ? "ON" : "OFF";
    m += " set to ";
    m += (value) ? "ON" : "OFF";
}