public net.sf.staccatocommons.iterators.thriter.Thriterator<A> iterator() {
    if ((iter) == null) {
        iter = source.iterator();
        A next = null;
        while ((iter.hasNext()) && (predicate.eval((next = iter.next())))) {
            next = null;
        } 
        if (next == null)
            iter = net.sf.staccatocommons.iterators.thriter.Thriterators.from(iter);
        else
            iter = new net.sf.staccatocommons.iterators.PrependThriterator<A>(next, iter);
        
    }
    return iter;
}