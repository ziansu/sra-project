public void printAll() {
    uic.project.commuter.carPoolData.iterator.CarPoolIterator iter = this.getIterator();
    while (iter.hasNext(this)) {
        uic.project.commuter.carPoolData.iterator.CarPoolComponent currentObject = iter.next(this);
        currentObject.printSelf();
        uic.project.commuter.carPoolData.iterator.CarPoolIterator tier2Iter = this.getIterator();
        if ((currentObject.getClass()) == (this.getClass())) {
            while (tier2Iter.hasNext(currentObject)) {
                tier2Iter.next(currentObject).printSelf();
            } 
        }
    } 
}