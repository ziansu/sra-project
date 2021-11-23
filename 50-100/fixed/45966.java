@java.lang.Override
public void updateCache(final java.util.List<? extends T> objs) {
    for (final T obj : objs) {
        if ((obj.getName()) != null) {
            if (((obj.isDeleted()) != null) && (obj.isDeleted())) {
                nameCache.remove(obj.getName());
            }else {
                nameCache.put(obj.getName(), obj);
            }
        }
    }
    super.updateCache(objs);
}