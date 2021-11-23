@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if ((obj == null) || (!(lilium.arubabacon.iBeacon.class.isAssignableFrom(obj.getClass()))))
        return false;
    
    return ((lilium.arubabacon.iBeacon) (obj)).mac.equals(mac);
}