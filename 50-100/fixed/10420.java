public double[] getPhaseTable() {
    for (int i = 0; i < 1024; i++)
        re[i] = data[i];
    
    cafe.analysis.cafe.analysis.FFT.fft(re, im, 10, (-1));
    double[] temp1 = cafe.analysis.cafe.analysis.FFT.get_theta();
    return temp1;
}