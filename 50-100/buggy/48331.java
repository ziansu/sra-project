@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent arg0) {
    java.lang.System.out.println(((("Button clicked or action'd at X: " + (x)) + " Y: ") + (y)));
    if ((myFile) == null) {
        java.lang.System.out.println("File not initialized for this button");
        return ;
    }
    if (!(myFile.exists())) {
        java.lang.System.out.println("File not found to play for this button");
        return ;
    }
    playFile(myFile);
    thisBox.myButton.setBackground(java.awt.Color.GREEN);
}