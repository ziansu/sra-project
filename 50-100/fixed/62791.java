protected void processWindowEvent(java.awt.event.WindowEvent e) {
    if ((e.getID()) == (java.awt.event.WindowEvent.WINDOW_CLOSING)) {
        if (net.sf.memoranda.util.Configuration.get("ON_CLOSE").equals("exit"))
            doExit();
        else
            doExit();
        
    }else
        super.processWindowEvent(e);
    
}