public void setAltitude(bwem.Altitude altitude) {
    if (!((isAltitudeMissing()) && ((altitude.intValue()) > 0))) {
        throw new java.lang.IllegalStateException("Altitude is already set");
    }else
        if (!((altitude.intValue()) > 0)) {
            throw new java.lang.IllegalArgumentException("invalid Altitude");
        }else {
            this.altitude = new bwem.Altitude(altitude);
        }
    
}