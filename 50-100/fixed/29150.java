public graphs.BooleanGraph next() {
    if ((currentGraphNumber) > (maxGraphNumber)) {
        throw new java.util.NoSuchElementException();
    }
    long toReturn = currentGraphNumber;
    do {
        (currentGraphNumber)++;
    } while (((currentGraphNumber) <= (maxGraphNumber)) && (!(filterGraphs(currentGraphNumber))) );
    prevGraphNumber = lastGraphNumber;
    lastGraphNumber = toReturn;
    return graphs.GraphIterator.numberToGraph(toReturn);
}