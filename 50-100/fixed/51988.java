@java.lang.Override
public void dispose() {
    if ((plottingSystem) != null) {
        plottingSystem.dispose();
        plottingSystem = null;
    }
    if ((stream) != null) {
        try {
            if ((shapeListener) != null) {
                stream.removeDataListener(shapeListener);
            }
            stream.disconnect();
        } catch (java.lang.Exception e) {
            uk.ac.gda.client.live.stream.view.LiveStreamView.logger.error("Error disconnecting remote data stream", e);
        } finally {
            stream = null;
        }
    }
    super.dispose();
}