private static long getMapValue(java.util.Map<?, java.lang.Long> map, long ssrc) {
    synchronized(map) {
        java.lang.Long res = map.get(ssrc);
        return res == null ? 0 : res;
    }
}