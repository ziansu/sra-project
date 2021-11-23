private java.lang.String getPlayerName() {
    java.lang.String name = null;
    name = ui.Dialogs.getInput(mainFrame, "Enter Name", "Please enter your name.");
    if (name != null)
        return name;
    
    java.lang.System.exit(0);
    return null;
}