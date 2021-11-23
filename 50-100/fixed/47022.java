@java.lang.Override
public void updateCache(final T obj) {
    if ((obj.getNumber()) != null) {
        if (((obj.isDeleted()) != null) && (obj.isDeleted())) {
            numberCache.remove(obj.getNumber());
        }else {
            numberCache.put(obj.getNumber(), obj);
        }
    }
    super.updateCache(obj);
}