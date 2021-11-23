private static <T, S> S seed(java.util.Iterator<? extends T> iterator, java.lang.Object callable) {
    if (callable instanceof com.googlecode.totallylazy.Identity)
        return com.googlecode.totallylazy.Unchecked.<com.googlecode.totallylazy.Identity<S>>cast(callable).identity();
    
    return com.googlecode.totallylazy.Unchecked.<S>cast(iterator.next());
}