@java.lang.Override
public void stateChanged(javax.swing.event.ChangeEvent ignore) {
    org.openstreetmap.josm.gui.util.GuiHelper.runInEDT(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            progressRenderer.setTasks(progressMonitor.toString());
        }
    });
}