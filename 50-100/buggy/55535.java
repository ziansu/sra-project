public static byte[] mappedIPv4ToRealIPv4(byte[] addr) {
    if (org.ice4j.ice.NetworkUtils.isMappedIPv4Addr(addr)) {
        byte[] newAddr = new byte[org.ice4j.ice.NetworkUtils.IN4_ADDR_SIZE];
        java.lang.System.arraycopy(addr, 12, newAddr, 0, org.ice4j.ice.NetworkUtils.IN6_ADDR_SIZE);
        return newAddr;
    }
    return null;
}