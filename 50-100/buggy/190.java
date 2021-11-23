@java.lang.Override
public void run() {
    try {
        java.lang.Boolean trackingEnabled = com.growthbeat.utils.DeviceUtils.getTrackingEnabled().get();
        if (trackingEnabled != null)
            setTag(Tag.TagType.custom, "TrackingEnabled", java.lang.String.valueOf(trackingEnabled));
        
    } catch (java.lang.Exception e) {
        logger.warning(("Failed to get trackingEnabled: " + (e.getMessage())));
    }
}