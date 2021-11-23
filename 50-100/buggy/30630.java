@java.lang.Override
public java.lang.Integer previous() {
    if ((previous) == (-1))
        throw new java.util.NoSuchElementException();
    
    recent = previous;
    next = recent;
    previous = lastInRange(from, recent);
    if ((nextIndex) != (com.tomgibara.bits.BitVector.PositionIterator.NOT_SET))
        (nextIndex)--;
    
    return (next) - (start);
}