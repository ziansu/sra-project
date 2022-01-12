public static <T> com.hsjawanda.gaeobjectify.collections.RefsList<T> wrap(java.util.Set<com.googlecode.objectify.Ref<T>> setToWrap) {
    java.util.List<com.googlecode.objectify.Ref<T>> toWrap = null;
    if (null != setToWrap) {
        toWrap = new java.util.ArrayList<com.googlecode.objectify.Ref<T>>(setToWrap.size());
        for (com.googlecode.objectify.Ref<T> ref : setToWrap) {
            if (null != ref) {
                toWrap.add(ref);
            }
        }
    }
    return com.hsjawanda.gaeobjectify.collections.RefsList.wrap(toWrap);
}