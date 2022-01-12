public RecyclableObject getRecyclable(java.lang.Class cls, java.lang.Object... args) {
    for (RecyclableObject r : recyclables) {
        if (r.isSafeToRecycle()) {
            r.onRecycle(args);
            return r;
        }
    }
    try {
        RecyclableObject obj = ((RecyclableObject) (cls.newInstance()));
        obj.onRecycle(args);
        recyclables.add(obj);
        return obj;
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return null;
}