public <K1 extends K, V1 extends V> com.codelanx.codelanxlib.util.cache.ExpiringMap.Builder<K1, V1> onExpiry(java.util.function.Consumer<? extends com.codelanx.codelanxlib.util.cache.ExpiringMap.ExpiringEntry<? super K, ? super V>> expired) {
    this.onExpire = expired;
    return ((com.codelanx.codelanxlib.util.cache.ExpiringMap.Builder<K1, V1>) (this));
}