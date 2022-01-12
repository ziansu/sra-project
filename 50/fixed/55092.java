private java.lang.String getPlayerName() {
    java.lang.String name = null;
    name = ui.Dialogs.getInput(mainFrame, "Enter Name", "Please enter your name.");
    return name;
}