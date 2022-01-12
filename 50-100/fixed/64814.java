public java.lang.Object pop() {
    while (true) {
        block5.LockFreeStack.Node oldtop = top.get();
        if (oldtop == null) {
            continue;
        }
        block5.LockFreeStack.Node newtop = oldtop.next;
        if (top.compareAndSet(oldtop, newtop)) {
            return oldtop.value;
        }
    } 
}