public java.util.List<net.sf.marineapi.nmea.util.Measurement> getMeasurements() {
    int setCount = (getFieldCount()) / (net.sf.marineapi.nmea.parser.XDRParser.DATA_SET_LENGTH);
    java.util.ArrayList<net.sf.marineapi.nmea.util.Measurement> result = new java.util.ArrayList<net.sf.marineapi.nmea.util.Measurement>(setCount);
    for (int i = 0; i <= setCount; i += net.sf.marineapi.nmea.parser.XDRParser.DATA_SET_LENGTH) {
        net.sf.marineapi.nmea.util.Measurement value = fetchValues(i);
        if (!(value.isEmpty())) {
            result.add(value);
        }
    }
    return result;
}