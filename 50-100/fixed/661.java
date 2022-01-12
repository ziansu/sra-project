public void updateCache(final java.util.List<? extends T> objs) {
    for (final T obj : objs) {
        if ((obj.getId()) != null) {
            if (((obj.isDeleted()) != null) && (obj.isDeleted())) {
                idCache.remove(obj.getId());
            }else {
                idCache.put(obj.getId(), obj);
            }
        }
    }
}