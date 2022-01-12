public static int getBroadcastAddress(java.lang.String interfaceName, java.lang.StringBuilder broadcastAddress) {
    int toReturn = studyproject.API.Lvl.Low.Broadcast.getAddress(interfaceName, broadcastAddress);
    broadcastAddress.delete(((broadcastAddress.length()) - 3), broadcastAddress.length());
    broadcastAddress.append("255");
    return toReturn;
}