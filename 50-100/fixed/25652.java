@java.lang.Override
public void onPressedEnter() {
    if (((activeView) == (ccre.supercanvas.components.channels.FloatControlComponent.View.TEXTUAL)) && ((getPanel().editing) == (activeBuffer))) {
        try {
            setDele(false, java.lang.Float.parseFloat(activeBuffer.toString()));
            getPanel().editing = null;
        } catch (java.lang.NumberFormatException ex) {
            ccre.log.Logger.warning((("Could not parse number '" + (activeBuffer)) + "'."));
        }
    }
}