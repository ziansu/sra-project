@java.lang.Override
public de.caluga.morphium.query.MorphiumIterator<T> asIterable(int windowSize, java.lang.Class<? extends de.caluga.morphium.query.MorphiumIterator<T>> it) {
    try {
        de.caluga.morphium.query.MorphiumIterator<T> ret = it.newInstance();
        return asIterable(windowSize, ret);
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException(e);
    }
}