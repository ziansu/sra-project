protected void processWindowEvent(java.awt.event.WindowEvent e) {
    if ((e.getID()) == (java.awt.event.WindowEvent.WINDOW_CLOSING)) {
        if (net.sf.memoranda.util.Configuration.get("ON_CLOSE").equals("exit"))
            doExit();
        else
            doExit();
        
    }else
        if ((e.getID()) == (java.awt.event.WindowEvent.WINDOW_ICONIFIED)) {
            super.processWindowEvent(new java.awt.event.WindowEvent(this, java.awt.event.WindowEvent.WINDOW_ICONIFIED));
            doMinimize();
        }else
            super.processWindowEvent(e);
        
    
}