public void showDebugWindow() {
    if ((com.builtbroken.mc.core.Engine.runningAsDev) && (!(java.awt.GraphicsEnvironment.isHeadless()))) {
        if ((debugWindow) == null) {
            debugWindow = new com.builtbroken.mc.debug.gui.FrameDebug();
            debugWindow.init();
        }
        debugWindow.setVisible(true);
    }
}