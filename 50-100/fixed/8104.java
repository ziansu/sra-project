@java.lang.Override
@java.lang.SuppressWarnings(value = "unchecked")
public V get() throws java.io.IOException {
    if ((monkey != null) && (filer != null)) {
        synchronized(monkey) {
            long ai = MapStore.INSTANCE.get(filer, monkey, keyBytes);
            if (ai > (-1)) {
                return ((V) (values[((int) (ai))]));
            }
        }
    }
    return null;
}