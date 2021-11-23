@java.lang.SuppressWarnings(value = "unchecked")
public java.lang.Object clone() {
    try {
        org.leplus.util.IdentityHashSet<E> newSet = ((org.leplus.util.IdentityHashSet<E>) (super.clone()));
        newSet.map = ((java.util.IdentityHashMap<E, java.lang.Object>) (map.clone()));
        return newSet;
    } catch (java.lang.CloneNotSupportedException e) {
        throw new java.lang.AssertionError("Unexpected cloning error", e);
    }
}