public java.lang.String showKeyboard(org.zkoss.zk.ui.event.Event e) {
    isKeyboard = true;
    org.adempiere.webui.component.Textbox field = ((org.adempiere.webui.component.Textbox) (e.getTarget()));
    org.adempiere.pos.WPOSKeyboard keyboard = v_POSPanel.getKeyboard();
    if (keyboard != null) {
        if (e.getName().equals(Events.ON_FOCUS)) {
            keyboard.setPosTextField(field);
            org.adempiere.webui.apps.AEnv.showWindow(keyboard);
        }
    }
    return field.getText();
}