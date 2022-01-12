protected boolean setupPort() {
    reader = new SimpleRead();
    reader.setCommPortId(portNum);
    reader.read();
    reader_thread = new java.lang.Thread(reader);
    reader_thread.run();
    if (debug_messages)
        java.lang.System.out.println("Port Setup Complete");
    
    return true;
}