private void stop() {
    if ((server) != null)
        server.close();
    
    java.lang.System.out.println("Server closed!");
    start.setSelected(false);
    stop.setSelected(false);
    selected = false;
    stop.setEnabled(false);
    clear.setEnabled(true);
}