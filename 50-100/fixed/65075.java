private int getDecodedFrameSize(com.biorecorder.ads.AdsConfiguration configuration) {
    int result = 0;
    result += getNumberOf3ByteSamples(configuration);
    if (configuration.isAccelerometerEnabled()) {
        result = result + (configuration.isAccelerometerOneChannelMode() ? 1 : 3);
    }
    if (configuration.isBatteryVoltageMeasureEnabled()) {
        result += 1;
    }
    return result;
}