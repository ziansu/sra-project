public void attachAlgebraInput() {
    org.geogebra.web.web.gui.app.GGWCommandLine inputbar = new org.geogebra.web.web.gui.app.GGWCommandLine();
    inputbar.attachApp(this);
    frame.add(inputbar);
    if (has(Feature.KEYBOARD_MESSED_WITH_OLD_INPUTBAR)) {
        updateSplitPanelHeight();
    }
    this.getGuiManager().getAlgebraInput().setInputFieldWidth(this.appletWidth);
}