private void nextIteration() {
    while (iterator.hasNext()) {
        next = iterator.next();
        if (predicate.test(next)) {
            hasNext = true;
            return ;
        }
    } 
    hasNext = false;
}