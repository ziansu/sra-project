@java.lang.Override
public void clear() {
    if ((size) > 0) {
        size = 0;
        for (int i = 0; i < (buckets.length); i++) {
            buckets[i] = null;
        }
    }
}