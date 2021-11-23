public double course(edu.stevens.nav.LatLon p2) {
    double dLon = (p2.lon) - (lon);
    double tana = (((java.lang.Math.sin(dLon)) / (java.lang.Math.cos(lat))) * (java.lang.Math.tan(p2.lat))) - ((java.lang.Math.sin(lat)) * (java.lang.Math.cos(dLon)));
    return java.lang.Math.atan(tana);
}