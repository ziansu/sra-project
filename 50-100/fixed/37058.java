public boolean inError() {
    nextapp.echo2.app.Window root = nextapp.echo2.app.ApplicationInstance.getActive().getDefaultWindow();
    for (nextapp.echo2.app.Component component : root.getContent().getComponents()) {
        if (component instanceof org.openvpms.web.echo.dialog.ErrorDialog) {
            return true;
        }
    }
    return false;
}