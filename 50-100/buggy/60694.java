public Container closestFromStart(Point val) {
    Container startPointer = this.first;
    while (((startPointer.getNext()) != null) && ((comp.compare(val, startPointer.getData())) == 1)) {
        startPointer = startPointer.getNext();
    } 
    return startPointer;
}