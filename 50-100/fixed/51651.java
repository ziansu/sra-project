public static javax.microedition.lcdui.Alert showError(java.lang.String title, java.lang.String message, javax.microedition.lcdui.Displayable next, javax.microedition.lcdui.CommandListener customListener) {
    final javax.microedition.lcdui.Alert alert = new javax.microedition.lcdui.Alert(title, message, null, javax.microedition.lcdui.AlertType.ERROR);
    alert.setTimeout(Alert.FOREVER);
    if (customListener != null) {
        if (next != null) {
            java.lang.System.err.println("Warning: alert invoked with both custom listener and 'next' displayable. 'next' will be ignored; it must be switched to explicitly in the custom handler");
        }
        alert.setCommandListener(customListener);
    }
    if (next == null) {
        org.javarosa.j2me.view.J2MEDisplay.display.setCurrent(alert);
    }else {
        org.javarosa.j2me.view.J2MEDisplay.display.setCurrent(alert, next);
    }
    return alert;
}