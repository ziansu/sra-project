private static java.lang.Object fromAddress(long address) {
    java.lang.Object[] array = new java.lang.Object[]{ null };
    long baseOffset = com.heerbann.unsafe.UnsafeBuffer.unsafe.arrayBaseOffset(java.lang.Object[].class);
    com.heerbann.unsafe.UnsafeBuffer.unsafe.putLong(array, baseOffset, address);
    return array[0];
}