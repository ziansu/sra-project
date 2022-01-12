@java.lang.Override
public void run() {
    imageprocessor.fft.twoDfft(inputData, realOut, imagOut, amplitudeOut, start, end);
}