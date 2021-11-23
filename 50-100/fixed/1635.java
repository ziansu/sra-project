public void IncrsRedCorRB() {
    if ((((JoystickTest.PressJSRedCorRB) == true) && ((JoystickTest.pressLstJSRedCorRB) != true)) && ((SettingsUI.RedCorRight) == true)) {
        if ((AutoState) == true) {
            RedCorAutoSpin.setValue((++(RedCorAuto)));
            JoystickTest.pressLstJSRedCorRB = true;
        }
        if ((TeleState) == true) {
            RedCorTeleSpin.setValue((++(RedCorTele)));
            JoystickTest.pressLstJSRedCorRB = true;
        }
    }
}