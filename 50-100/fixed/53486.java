@java.lang.Override
public synchronized java.nio.ByteBuffer allocate(int size) {
    java.nio.ByteBuffer a = allocate(mpjdev.natmpjdev.util.BuddyAllocator.nextPowerOfTwo(size), tree);
    if ((a == null) && (throwExceptionOnAllocationFailure)) {
        throw new java.lang.IllegalArgumentException((("Can not allocate a bytebuffer of size " + size) + "."));
    }
    if (a != null)
        a.limit(size);
    
    return a;
}