public void sampleRTT(int sRTT) {
    eRTT = ((int) (((1 - (alpha)) * (eRTT)) + ((alpha) * sRTT)));
    dRTT = ((int) (((1 - (beta)) * (dRTT)) + ((beta) * (java.lang.Math.abs((sRTT - (eRTT)))))));
}