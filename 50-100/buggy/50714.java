public static long toMemory(java.lang.CharSequence sequence) {
    long lo = com.questdb.test.tools.Unsafe.getUnsafe().allocateMemory(((sequence.length()) * 2));
    long ptr = lo;
    for (int i = 0; i < (sequence.length()); i++) {
        com.questdb.test.tools.Unsafe.getUnsafe().putByte((lo++), ((byte) (sequence.charAt(i))));
    }
    return ptr;
}