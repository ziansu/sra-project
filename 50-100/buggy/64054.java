public final void startLoop(omnikryptec.main.OmniKryptecEngine.ShutdownOption shutdownOption) {
    setShutdownOption(shutdownOption);
    try {
        state = omnikryptec.main.OmniKryptecEngine.State.Running;
        while ((!(org.lwjgl.opengl.Display.isCloseRequested())) && (!(requestclose))) {
            frame(true);
        } 
    } catch (java.lang.Exception e) {
        state = omnikryptec.main.OmniKryptecEngine.State.Error;
        omnikryptec.logger.Logger.logErr(("Error while looping: " + e), e);
        eventsystem.fireEvent(new omnikryptec.event.Event(e), EventType.ERROR);
    }
    close(this.shutdownOption);
}