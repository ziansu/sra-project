public int createTransition(datamodel.Position position) {
    java.lang.String name = clickArgument;
    int transitionId = -1;
    try {
        transitionId = Main.guiControlller.createTransition(position, name);
        gui.Main.updateUserMsg(java.lang.String.format("Added Transition: %s", name));
    } catch (java.lang.Exception e1) {
        gui.Main.updateUserWarning(e1.getMessage());
        this.clickArgument = "";
    }
    return transitionId;
}