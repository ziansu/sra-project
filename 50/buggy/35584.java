@java.lang.Override
public void windowClosing(java.awt.event.WindowEvent e) {
    try {
        java.lang.System.out.println("DEBUG: UNLOADED EDITOR");
        objEditorPanels.remove(currEditorPanel);
    } catch (java.lang.Exception ex) {
        com.freedomotic.jfrontend.Renderer.LOG.log(java.util.logging.Level.SEVERE, "Cannot unload object editor frame", ex);
    }
}