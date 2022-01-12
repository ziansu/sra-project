public RecyclableObject getRecyclable(java.lang.Class cls, java.lang.Object... args) {
    if (!(recyclables.isEmpty())) {
        RecyclableObject obj = recyclables.pop();
        obj.onRecycle(args);
        return obj;
    }
    try {
        RecyclableObject obj = ((RecyclableObject) (cls.newInstance()));
        obj.onRecycle(args);
        return obj;
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return null;
}