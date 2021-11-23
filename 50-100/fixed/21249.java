@java.lang.Override
public java.lang.String toString() {
    java.lang.String res = ("$LOC," + (c_secjour)) + ",";
    if ((c_latitude) < 0)
        res += "-";
    
    res += c_latitude;
    res += ",";
    if ((c_longitude) < 0)
        res += "-";
    
    res += c_longitude;
    res += ",";
    res += c_altitude;
    res += ",";
    res += c_vitesse;
    return mySimulator.Checksum.add(res);
}