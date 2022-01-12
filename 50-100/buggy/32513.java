public java.util.Set<java.lang.String> getLocalSamples() {
    java.util.Set<java.lang.String> res = new java.util.HashSet<java.lang.String>();
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