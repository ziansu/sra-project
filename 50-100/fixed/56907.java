@java.lang.Override
public void run() {
    try {
        long waterMarkTs = computeWaterMarkTs();
        if (waterMarkTs > (lastWaterMarkTs.get())) {
            this.windowManager.add(new org.apache.storm.windowing.WaterMarkEvent(waterMarkTs));
            lastWaterMarkTs.set(waterMarkTs);
        }
    } catch (java.lang.Throwable th) {
        org.apache.storm.windowing.WaterMarkEventGenerator.LOG.error("Failed while processing watermark event ", th);
        throw th;
    }
}