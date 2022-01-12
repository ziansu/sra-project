public java.lang.ref.WeakReference<java.lang.Object> get(java.lang.Object obj) {
    java.lang.ref.WeakReference<java.lang.Object> res = null;
    java.lang.Long id = ((long) (obj.hashCode()));
    java.util.List<java.lang.ref.WeakReference<java.lang.Object>> bucket = buckets.get(id);
    if (bucket != null) {
        for (java.lang.ref.WeakReference<java.lang.Object> ref : bucket) {
            if (ref.get().equals(obj)) {
                res = ref;
                break;
            }
        }
    }
    return res;
}