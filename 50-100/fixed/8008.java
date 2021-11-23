public void ignoreBlank() {
    if (!(Settings.ignoreBlanks))
        return ;
    
    while (((application.VirtualCursor.getCurrentElement(application.VirtualCursor.gridPane)) != null) && ((((javafx.scene.control.Label) (application.VirtualCursor.getCurrentElement(application.VirtualCursor.gridPane))).getText().charAt(0)) == ' ')) {
        moveCursor();
    } 
}