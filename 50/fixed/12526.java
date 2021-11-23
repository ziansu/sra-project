public void setMoinsPV(int nbPV) {
    PVlost += nbPV;
    int a = (PV) - nbPV;
    if (a > 0) {
        PV -= nbPV;
    }else {
        PV = 0;
    }
}