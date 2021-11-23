public net.sf.staccatocommons.iterators.thriter.Thriterator<A> iterator() {
    final java.util.Iterator<A> iter = source.iterator();
    A next = null;
    while ((iter.hasNext()) && (predicate.eval((next = iter.next())))) {
        next = null;
    } 
    if (next == null)
        return net.sf.staccatocommons.iterators.thriter.Thriterators.from(iter);
    
    return new net.sf.staccatocommons.iterators.PrependThriterator<A>(next, iter);
}