private void calculateImplulseResponse() {
    java.util.ArrayList<java.lang.Double> impulseResponseSamples = getImpulseResponseSamples();
    double samplingRateInSeconds = 1.0 / (io.github.antishake.AntiShake.SAMPLING_RATE_IN_HZ);
    int i = 0;
    double intervalInSeconds;
    do {
        intervalInSeconds = i * samplingRateInSeconds;
        impulseResponseSamples.add(calculateImplulseResponse(intervalInSeconds));
        i++;
    } while (intervalInSeconds < (io.github.antishake.AntiShake.CIRCULAR_BUFFER_IN_SEC) );
}