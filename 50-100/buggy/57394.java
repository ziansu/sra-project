@java.lang.Override
public void updateCache(final T obj) {
    if ((obj.getName()) != null) {
        if (obj.isDeleted()) {
            nameCache.remove(obj.getName());
        }else {
            nameCache.put(obj.getName(), obj);
        }
    }
    super.updateCache(obj);
}