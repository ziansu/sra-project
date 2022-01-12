public void insertAfter(java.util.Collection<? extends E> toInsert, E point) {
    if (toInsert == null)
        throw new java.lang.RuntimeException(("Warning! You tried to insert " + "a null list into a Chain!"));
    
    E previousPoint = point;
    for (E o : toInsert) {
        insertAfter(o, previousPoint);
        previousPoint = o;
    }
}