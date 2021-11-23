@org.eclipse.smarthome.model.script.engine.action.ActionDoc(text = "sets the master volume of the host")
public static void setMasterVolume(@org.eclipse.smarthome.model.script.engine.action.ParamDoc(name = "volume", text = "volume in the range [0,1]")
final float volume) throws java.io.IOException {
    if ((volume < 0) || (volume > 1)) {
        throw new java.lang.IllegalArgumentException("Volume value must be in the range [0,1]!");
    }
    if (org.eclipse.smarthome.io.audio.internal.AudioAction.isMacOSX()) {
        org.eclipse.smarthome.io.audio.internal.AudioAction.audioManager.setVolume("macosx", volume);
    }else {
        org.eclipse.smarthome.io.audio.internal.AudioAction.audioManager.setVolume("javasound", volume);
    }
}