public java.lang.annotation.Annotation[][] getParameterAnnotations() {
    java.lang.annotation.Annotation[][] all = null;
    for (java.lang.reflect.Method m : methods) {
        java.lang.annotation.Annotation[][] next = m.getParameterAnnotations();
        if (all == null) {
            all = next;
        }else {
            for (int i = 0; i < (next.length); i++) {
                all[i] = union(all[i], next[i]);
            }
        }
    }
    return all;
}