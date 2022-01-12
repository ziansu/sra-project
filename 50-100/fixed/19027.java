private void sendCOMTest(java.lang.String portToTest, java.lang.String channels) {
    arduino.ArduinoCOM port = new arduino.ArduinoCOM(portToTest);
    port.openConnection();
    if (channels == "BOTH") {
        port.serialWrite('Z');
    }else
        if (channels == "A") {
            port.serialWrite('X');
        }else
            if (channels == "B") {
                port.serialWrite('Y');
            }
        
    
    port.closeConnection();
}