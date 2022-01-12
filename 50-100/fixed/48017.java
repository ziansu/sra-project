public java.lang.String getNamedSpeed(float speed) {
    java.util.Enumeration<java.lang.String> e = jmri.implementation.SignalSpeedMap._table.keys();
    while (e.hasMoreElements()) {
        java.lang.String key = e.nextElement();
        if ((jmri.implementation.SignalSpeedMap._table.get(key)) == speed) {
            return key;
        }
    } 
    return null;
}