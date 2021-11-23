@java.lang.Override
public long getAndSetLong(final java.lang.Object obj, final long address, final long value) {
    long retVal;
    do {
        retVal = myUnsafe.getLongVolatile(obj, address);
    } while (!(myUnsafe.compareAndSwapLong(obj, address, retVal, value)) );
    return retVal;
}