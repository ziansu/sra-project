@java.lang.Override
public void updateCache(final java.util.List<? extends T> objs) {
    for (final T obj : objs) {
        if ((obj.getNumber()) != null) {
            if (((obj.isDeleted()) != null) && (obj.isDeleted())) {
                numberCache.remove(obj.getNumber());
            }else {
                numberCache.put(obj.getNumber(), obj);
            }
        }
    }
    super.updateCache(objs);
}