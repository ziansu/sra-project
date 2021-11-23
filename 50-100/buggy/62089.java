public final void setPin(boolean state) {
    java.lang.System.out.println(("------------------------setting pin to : " + state));
    pinPricked = state;
    mPinButton.setIcon((pinPricked ? ICON_PIN_ROLLOVER : ICON_PIN_STANDARD));
    mPinButton.setRolloverIcon((pinPricked ? ICON_PIN_STANDARD : ICON_PIN_ROLLOVER));
    mEditorConfig.setProperty("autohidebottombar", java.lang.String.valueOf(pinPricked));
}