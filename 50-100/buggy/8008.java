public void ignoreBlank() {
    if (!(Settings.ignoreBlanks))
        return ;
    
    javafx.scene.control.Label current = ((javafx.scene.control.Label) (application.VirtualCursor.getCurrentElement(application.VirtualCursor.gridPane)));
    while ((current != null) && ((current.getText().charAt(0)) == ' ')) {
        moveCursor();
    } 
}