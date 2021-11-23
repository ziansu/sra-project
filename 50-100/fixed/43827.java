public void markBaseChanged() {
    baseChanged = true;
    java.lang.String oldTitle = frame.getTabTitle(this);
    if (!(oldTitle.endsWith("*"))) {
        frame.setTabTitle(this, (oldTitle + '*'), frame.getTabTooltip(this));
        frame.setWindowTitle();
    }
    if (frame.statusLine.getText().startsWith(net.sf.jabref.Globals.lang("Saved database"))) {
        frame.output(" ");
    }
}