@java.lang.Override
public void show() {
    if (((core_.getSLMDevice().length()) == 0) && ((core_.getGalvoDevice().length()) == 0)) {
        app_.showMessage(("Please load an SLM (Spatial Light Modulator) " + ("or a Galvo-based phototargeting device " + "before using the Projector plugin.")));
        return ;
    }
    org.micromanager.projector.ProjectorControlForm.showSingleton(core_, app_);
}