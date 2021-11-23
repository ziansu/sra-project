public final void startLoop(omnikryptec.main.OmniKryptecEngine.ShutdownOption shutdownOption) {
    setShutdownOption(shutdownOption);
    state = omnikryptec.main.OmniKryptecEngine.State.Running;
    while ((!(org.lwjgl.opengl.Display.isCloseRequested())) && (!(requestclose))) {
        frame(true);
    } 
    close(this.shutdownOption);
}