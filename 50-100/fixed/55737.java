public Container closestFromEnd(Point val) {
    Container endPointer = this.last;
    if (endPointer == null)
        return null;
    
    while (((endPointer.getBack()) != null) && ((comp.compare(val, endPointer.getData())) == (-1))) {
        endPointer = endPointer.getBack();
    } 
    return endPointer;
}