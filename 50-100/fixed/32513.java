public java.util.List<java.lang.String> getLocalSamples() {
    java.util.List<java.lang.String> res = new java.util.ArrayList<java.lang.String>();
    int i = 0;
    double cTemp;
    for (java.lang.String v : data) {
        if (((i++) % (Consts.SAMPLE_BASE)) == 0) {
            cTemp = getTemp(v);
            sampleTemps.add(cTemp);
            res.add((cTemp + ""));
        }
    }
    return res;
}