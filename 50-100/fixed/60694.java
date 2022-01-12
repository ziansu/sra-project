public Container closestFromStart(Point val) {
    Container startPointer = this.first;
    if (startPointer == null)
        return null;
    
    while (((startPointer.getNext()) != null) && ((comp.compare(val, startPointer.getData())) == 1)) {
        startPointer = startPointer.getNext();
    } 
    return startPointer;
}