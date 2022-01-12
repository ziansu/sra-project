public void setFrameRate(int framesPerSecond) {
    if ((framesPerSecond < 1) || (framesPerSecond > 1000)) {
        throw new java.lang.IllegalArgumentException((("DFTProcessor cannot run " + "more than 1000 times per second -- requested setting:") + framesPerSecond));
    }
    mFrameRate = framesPerSecond;
    properties.SystemProperties properties = properties.SystemProperties.getInstance();
    properties.set(spectrum.DFTProcessor.FRAME_RATE_PROPERTY, java.lang.String.valueOf(mFrameRate));
    properties.save();
    calculateConsumptionRate();
    restart();
}