private boolean computeNextFromSourceAndFilter() {
    while (source.hasNext()) {
        long value = source.next();
        if ((!(removedElements.contains(value))) && (!(addedElements.contains(value)))) {
            return next(value);
        }
    } 
    transitionToAddedElements();
    return phase.fetchNext(this);
}