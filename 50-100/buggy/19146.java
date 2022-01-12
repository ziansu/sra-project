@java.lang.Override
protected void hardSetLowPass(final float value) {
    final float[] testValues = new float[uk.co.modularaudio.util.audio.controlinterpolation.CDLowPass12Interpolator.TEST_VALUES_LENGTH];
    java.util.Arrays.fill(testValues, value);
    for (int i = 0; i < 100; ++i) {
        lowPassFilter(testValues, 0, uk.co.modularaudio.util.audio.controlinterpolation.CDLowPass12Interpolator.TEST_VALUES_LENGTH);
    }
}