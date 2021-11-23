public int compare(org.atum.jvcp.config.GeoIP.CountryId c1, org.atum.jvcp.config.GeoIP.CountryId c2) {
    if (((c1.ipValHigh) == (c2.ipValHigh)) && ((c1.ipValLow) == (c1.ipValLow))) {
        return 0;
    }else
        if ((c1.ipValHigh) > (c2.ipValHigh)) {
            return -1;
        }else {
            return 1;
        }
    
}