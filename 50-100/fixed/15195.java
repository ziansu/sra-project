static void twoDfft(double[][] inputData, double[][] realOut, double[][] imagOut, double[][] amplitudeOut) {
    int height = inputData.length;
    imageprocessor.fft.twoDfft(inputData, realOut, imagOut, amplitudeOut, 0, height);
}