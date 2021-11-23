@java.lang.Override
public void run() {
    timer.scheduleAtFixedRate(new java.util.TimerTask() {
        @java.lang.Override
        public void run() {
            try {
                export();
            } catch (java.io.IOException e) {
                statusProperty.set("Failed to export file!");
                org.teamninjaneer.simulator.locationsimulator.FileExporter.LOGGER.log(java.util.logging.Level.SEVERE, "Failed to export file!", e);
            }
        }
    }, 0, newFileRate.toMillis());
}