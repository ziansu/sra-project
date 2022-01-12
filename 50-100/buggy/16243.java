public static int Zmove(int Z, int ndiscr, int st1, int delay) {
    int j;
    int k;
    int cZ;
    cZ = Z;
    for (j = 0; j < ndiscr; j++) {
        cZ = cZ + (st1 << 16);
        for (k = 0; k < delay; k++) {
        }
        mlab.Simple.bramRead(mlab.Spectrsfm.M_A);
        mlab.Simple.bramWrite(mlab.Spectrsfm.M_DACZ, cZ);
    }
    return cZ;
}