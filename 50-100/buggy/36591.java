public void attachAlgebraInput() {
    boolean regenerate = (getGuiManager().getAlgebraInput()) != null;
    org.geogebra.web.web.gui.app.GGWCommandLine inputbar = new org.geogebra.web.web.gui.app.GGWCommandLine();
    inputbar.attachApp(this);
    frame.add(inputbar);
    if (has(Feature.KEYBOARD_MESSED_WITH_OLD_INPUTBAR)) {
        updateSplitPanelHeight();
    }
    this.getGuiManager().getAlgebraInput().setInputFieldWidth(this.appletWidth);
}