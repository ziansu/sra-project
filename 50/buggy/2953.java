public void run() {
    while (!(isClosed)) {
        if (org.archicontribs.database.GUI.DBGui.display.readAndDispatch())
            org.archicontribs.database.GUI.DBGui.display.sleep();
        
    } 
}