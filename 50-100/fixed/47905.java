private boolean nullSafeEquals(K key, java.lang.Object other) {
    if (key == null) {
        if (other == null) {
            return true;
        }
    }else
        if ((key != (org.eclipse.collections.impl.map.mutable.primitive.ObjectBooleanHashMapWithHashingStrategy.NULL_KEY)) && (other != null)) {
            if (this.hashingStrategy.equals(key, this.toNonSentinel(other))) {
                return true;
            }
        }
    
    return false;
}