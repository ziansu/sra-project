public boolean hasFreeTimeRange(int mi, int mf, int dw) {
    return (((dow) != dw) || ((minIni) > mf)) || ((minFin) < mi);
}