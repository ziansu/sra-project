private static void incrementSSRCCounter(java.util.Map<java.lang.Long, java.lang.Long> map, long ssrc, long step) {
    synchronized(map) {
        java.lang.Long count = map.get(ssrc);
        map.put(ssrc, (count == null ? step : count + step));
    }
}