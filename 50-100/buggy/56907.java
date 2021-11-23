@java.lang.Override
public void run() {
    try {
        long waterMarkTs = computeWaterMarkTs();
        if (waterMarkTs > (lastWaterMarkTs)) {
            this.windowManager.add(new org.apache.storm.windowing.WaterMarkEvent<T>(waterMarkTs));
            lastWaterMarkTs = waterMarkTs;
        }
    } catch (java.lang.Throwable th) {
        org.apache.storm.windowing.WaterMarkEventGenerator.LOG.error("Failed while processing watermark event ", th);
        throw th;
    }
}