@java.lang.Override
public java.lang.Long get() {
    for (int i = 0; i < (jar_available.length); i++) {
        if (jar_available[i].get()) {
            jar_available[i].set(false);
            return java.lang.Long.class.cast(i);
        }
    }
    return -1L;
}