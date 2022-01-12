private void setBright() {
    byte[] lightValues = new byte[bei.m3c.models.Light.MAX_LIGHTS];
    for (int i = 0; i < (bei.m3c.models.Light.MAX_LIGHTS); i++) {
        lightValues[i] = lights.get(i).getValue();
    }
    bei.m3c.helpers.PICConnectionHelper.sendCommand(new bei.m3c.commands.TRCSetBrightCommand(lightValues));
    startReenableUpdateTimer();
}