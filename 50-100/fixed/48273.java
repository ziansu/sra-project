@java.lang.Override
public boolean hasNext() {
    while (this.innerIterator.hasNext()) {
        java.lang.Object pointer = innerIterator.next();
        if ((pointer.getClass()) == (this.targetClazz)) {
            currentObject = pointer;
            return true;
        }
    } 
    return false;
}