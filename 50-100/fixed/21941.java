public boolean isButtonPressed(pl.asie.charset.audio.tape.GuiTapeDrive.Button button) {
    if (button == (buttonHovering)) {
        return true;
    }
    if ((isRecordingFromFile(false)) && (button == (pl.asie.charset.audio.tape.GuiTapeDrive.Button.RECORD_FILE))) {
        return true;
    }
    switch (state) {
        case FORWARDING :
            return button == (pl.asie.charset.audio.tape.GuiTapeDrive.Button.FAST_FORWARD);
        case PLAYING :
            return button == (pl.asie.charset.audio.tape.GuiTapeDrive.Button.PLAY);
        case REWINDING :
            return button == (pl.asie.charset.audio.tape.GuiTapeDrive.Button.REWIND);
        case RECORDING :
            return button == (pl.asie.charset.audio.tape.GuiTapeDrive.Button.RECORD_AUDIO);
        case STOPPED :
        default :
            return false;
    }
}