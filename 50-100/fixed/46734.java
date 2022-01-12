@java.lang.Override
public void run() {
    try {
        java.lang.String advertisingId = com.growthbeat.utils.DeviceUtils.getAdvertisingId().get();
        if (advertisingId != null)
            setTag("AdvertisingID", advertisingId);
        
    } catch (java.lang.Exception e) {
        logger.warning(("Failed to get advertisingId: " + (e.getMessage())));
    }
}