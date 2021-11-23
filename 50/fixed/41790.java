public synchronized void delete() {
    assertAllocated();
    if ((self) != 0) {
        org.fusesource.leveldbjni.internal.NativeIterator.IteratorJNI.delete(self);
        self = 0;
    }
}