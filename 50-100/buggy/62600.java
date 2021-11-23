private void setupFrontEndBuffers(final int sampleRate) {
    final int frontEndBufferLength = uk.co.modularaudio.util.audio.timing.AudioTimingUtils.getNumSamplesForMillisAtSampleRate(sampleRate, LogarithmicTimeMillis1To1000SliderModel.MAX_MILLIS);
    if (((frontEndBuffers[0]) == null) || ((frontEndBuffers[0].length) != frontEndBufferLength)) {
        for (int c = 0; c < (uk.co.modularaudio.mads.base.scope.mu.ScopeMadDefinition.NUM_VIS_CHANNELS); ++c) {
            frontEndBuffers[c] = new float[frontEndBufferLength];
        }
    }
    frontEndWritePosition = 0;
}