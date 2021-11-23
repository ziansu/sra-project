@java.lang.Override
public void hardSetValue(final float value) {
    this.desVal = value;
    final float[] tmpArray = new float[uk.co.modularaudio.util.audio.controlinterpolation.LowPass12Interpolator.TMP_LENGTH];
    java.util.Arrays.fill(tmpArray, desVal);
    for (int i = 0; i < (uk.co.modularaudio.util.audio.controlinterpolation.LowPass12Interpolator.NUM_RESET_ITERS); ++i) {
        lpFilter.filter(tmpArray, 0, uk.co.modularaudio.util.audio.controlinterpolation.LowPass12Interpolator.TMP_LENGTH, LowPassInterpolatorConstants.LOW_PASS_CUTOFF, 0.5F, FrequencyFilterMode.LP, sampleRate);
        java.util.Arrays.fill(tmpArray, desVal);
    }
}