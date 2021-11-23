public static boolean cas(long[] array, int index, long expected, long value) {
    return com.questdb.misc.Unsafe.getUnsafe().compareAndSwapLong(array, ((com.questdb.misc.Unsafe.LONG_OFFSET) + (((long) (index)) << (com.questdb.misc.Unsafe.LONG_SCALE))), expected, value);
}