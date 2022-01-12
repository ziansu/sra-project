public void duplicateCmd() {
    app.getCopyPaste().copyToXML(app, app.getSelectionManager().getSelectedGeos(), false);
    app.getCopyPaste().pasteFromXML(app, false);
}