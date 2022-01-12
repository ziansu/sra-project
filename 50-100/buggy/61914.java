public N mix(long key, org.ojalgo.function.BinaryFunction<N> mixer, N addend) {
    java.util.Objects.requireNonNull(mixer);
    synchronized(myStorage) {
        final int tmpIndex = myStorage.index(key);
        final N oldValue = myStorage.getInternally(tmpIndex);
        final N newValue = (tmpIndex >= 0) ? mixer.invoke(oldValue, addend) : addend;
        myStorage.doSet(key, tmpIndex, newValue, true);
        return oldValue;
    }
}