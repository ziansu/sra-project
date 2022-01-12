@java.lang.Override
public void apply(final java.util.List<delight.keyvalue.StoreEntry<K, V>> matches) {
    if (delight.keyvalue.internal.HashMapAsyncMap.ENABLE_LOG) {
        java.lang.System.out.println((((this) + ": Found matches for count ") + matches));
    }
    callback.onSuccess(matches.size());
}