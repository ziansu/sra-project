@java.lang.Override
protected TSource computeNext() {
    while (super.parent.hasNext()) {
        ninja.sequence.internal.util.Key<TSource> key = new ninja.sequence.internal.util.Key<TSource>(super.parent.next(), this.comparator);
        if (!(this.set.add(key))) {
            continue;
        }
        return key.value;
    } 
    return ninja.sequence.internal.DistinctIterator.computationEnd();
}