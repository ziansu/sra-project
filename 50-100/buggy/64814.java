public java.lang.Object pop() {
    while (true) {
        block5.LockFreeStack.Node oldtop = top.get();
        if (oldtop == null) {
            throw new java.util.NoSuchElementException();
        }
        block5.LockFreeStack.Node newtop = oldtop.next;
        if (top.compareAndSet(oldtop, newtop)) {
            if (oldtop != null) {
                return oldtop.value;
            }
        }
    } 
}