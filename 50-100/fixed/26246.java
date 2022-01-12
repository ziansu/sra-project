private int colorFromDB(double d) {
    if (d >= 0) {
        return github.bewantbe.audio_analyzer_for_android.SpectrogramPlot.cma[0];
    }
    if (((d <= (dBLowerBound)) || (java.lang.Double.isInfinite(d))) || (java.lang.Double.isNaN(d))) {
        return github.bewantbe.audio_analyzer_for_android.SpectrogramPlot.cma[((github.bewantbe.audio_analyzer_for_android.SpectrogramPlot.cma.length) - 1)];
    }
    return github.bewantbe.audio_analyzer_for_android.SpectrogramPlot.cma[((int) (((github.bewantbe.audio_analyzer_for_android.SpectrogramPlot.cma.length) * d) / (dBLowerBound)))];
}