private void removeExpiredClients(org.redisson.core.RMap<java.lang.String, java.util.Date> map, java.util.Date date) {
    for (java.util.Map.Entry<java.lang.String, java.util.Date> entry : map.entrySet()) {
        boolean expired = checkExpires(entry.getValue(), date);
        if (expired) {
            map.remove(entry.getKey());
        }
    }
}