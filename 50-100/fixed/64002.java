@java.lang.Override
protected void keyTyped(char typedChar, int keyCode) throws java.io.IOException {
    if (isRecordingFromFile(false)) {
        if ((keyCode == 1) || (keyCode == (this.mc.gameSettings.keyBindInventory.getKeyCode()))) {
            return ;
        }
    }
    super.keyTyped(typedChar, keyCode);
}