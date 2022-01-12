public java.lang.String getNext(java.lang.String key) {
    java.lang.String hash = computeMd5(key);
    java.lang.String higherKey = circle.higherKey(hash);
    if (higherKey.isEmpty()) {
        hash = circle.firstKey();
    }else {
        hash = higherKey;
    }
    return circle.get(hash);
}