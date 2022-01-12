private boolean nullSafeEquals(K key, java.lang.Object other) {
    if ((key == null) && (other == null)) {
        return true;
    }
    if ((key != (org.eclipse.collections.impl.map.mutable.primitive.ObjectBooleanHashMapWithHashingStrategy.NULL_KEY)) && (other != null)) {
        if (this.hashingStrategy.equals(key, this.toNonSentinel(other))) {
            return true;
        }
    }
    return false;
}