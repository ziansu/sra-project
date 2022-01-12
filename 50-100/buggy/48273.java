@java.lang.Override
public boolean hasNext() {
    int a = 0;
    while (this.innerIterator.hasNext()) {
        java.lang.Object pointer = innerIterator.next();
        if ((pointer.getClass()) == (this.targetClazz)) {
            currentObject = pointer;
            return true;
        }
    } 
    return false;
}