@java.lang.Override
public long getAndAddLong(final java.lang.Object obj, final long address, final long increment) {
    long retVal;
    do {
        retVal = myUnsafe.getLongVolatile(obj, address);
    } while (!(myUnsafe.compareAndSwapLong(obj, address, retVal, (retVal + increment))) );
    return retVal;
}