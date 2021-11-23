private boolean setupPort() {
    if ((reader) == null) {
        reader = new SimpleRead();
        reader_thread = new java.lang.Thread(reader);
        reader.setCommPortId(portNum);
        reader.read();
        reader_thread.run();
        if (debug_messages)
            java.lang.System.out.println("Port Setup Complete");
        
        return true;
    }
    return false;
}