private byte[] getMessage(int zone, byte category, byte channel, byte value) {
    java.util.ArrayList<java.lang.Integer> zoneArray = new java.util.ArrayList<java.lang.Integer>();
    zoneArray.add(zone);
    return this.getMessage(zoneArray, category, channel, value);
}