public void updateCache(final T obj) {
    if ((obj.getId()) != null) {
        if (((obj.isDeleted()) != null) && (obj.isDeleted())) {
            idCache.remove(obj.getId());
        }else {
            idCache.put(obj.getId(), obj);
        }
    }
}