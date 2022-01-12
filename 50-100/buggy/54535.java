private void updateScaling(int height, int dataMax, int dataMin) throws java.lang.ArithmeticException {
    synchronized(mScaling) {
        mScaling = ((float) (height)) / (dataMax - dataMin);
        clearWaveform();
        if (org.lunci.waveform_viewer.BuildConfig.DEBUG) {
            android.util.Log.d(org.lunci.waveform.ui.WaveformPlotThread.TAG, ((("updating scaling:" + (mScaling)) + "; height=") + height));
        }
    }
}