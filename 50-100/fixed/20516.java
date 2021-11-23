public com.github.a2g.core.objectmodel.AutoplayCommand getNext() {
    if (!(currentSet.isEmpty()))
        return currentSet.removeFirst();
    
    if (solutions.isEmpty())
        return null;
    
    getNextSet(solutions.getFirst().getNext(((currentIndexIntoFirst)++)));
    if (!(currentSet.isEmpty()))
        return currentSet.removeFirst();
    
    solutions.removeFirst();
    currentIndexIntoFirst = 0;
    return getNext();
}