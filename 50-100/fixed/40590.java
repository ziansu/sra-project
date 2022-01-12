public void updatePhi(jgibblda.Model trnModel) {
    double Vbeta = (trnModel.V) * (beta);
    for (int k = 0; k < (K); k++) {
        for (int _w = 0; _w < (V); _w++) {
            if (data.lid2gid.containsKey(_w)) {
                phiCount.setQuick(_w, k, ((phiCount.getQuick(_w, k)) + (nw.getQuick(k, _w))));
            }
        }
    }
}