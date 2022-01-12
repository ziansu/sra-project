public controlP5.ScrollableList addScrollableList(final java.lang.Object theObject, java.lang.String theIndex, final java.lang.String theName, final int theX, final int theY, final int theW, final int theH) {
    controlP5.ScrollableList myController = new controlP5.ScrollableList(base.cp5, ((controlP5.Tab) (base.cp5.controlWindow.getTabs().get(1))), theName, theX, theY, theW, theH);
    base.cp5.register(theObject, theIndex, myController);
    myController.registerProperty("value");
    return myController;
}