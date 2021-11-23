public int[] getOutput(short[] pcm, int sampleRate) {
    if (pcm == null)
        return null;
    
    double[] spectrum = getSpectrum(pcm);
    final int amount = 100;
    int[] s = spectrumStrategy.excute(spectrum, sampleRate);
    for (int i = 0; i < (s.length); i++) {
        s[i] = ((int) ((spectrum[i]) / 1000));
    }
    return s;
}