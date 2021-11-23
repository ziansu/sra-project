private boolean computeNextFromSourceAndFilter() {
    while (source.hasNext()) {
        long value = source.next();
        if ((!(removedElements.contains(value))) && (!(addedElements.contains(value)))) {
            java.lang.System.out.println(("RETURNING A NODE FROM store, id is " + value));
            return next(value);
        }
    } 
    transitionToAddedElements();
    return phase.fetchNext(this);
}