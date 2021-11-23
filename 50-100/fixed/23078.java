public java.lang.String LL2MRGS(com.esri.geoevent.solutions.processor.ll2mgrs.LL ll) {
    double lat = ll.getLat();
    double lon = ll.getLon();
    int accuracy = ll.getAccuracy();
    com.esri.geoevent.solutions.processor.ll2mgrs.UTM utm = this.LL2UTM(lat, lon);
    java.lang.String mgrs = encode(utm, accuracy);
    return mgrs;
}