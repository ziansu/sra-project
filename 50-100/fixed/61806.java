public static long toAddress(java.lang.Object obj) {
    java.lang.Object[] array = new java.lang.Object[]{ obj };
    long baseOffset = com.heerbann.unsafe.UnsafeBuffer.unsafe.arrayBaseOffset(java.lang.Object[].class);
    return com.heerbann.unsafe.UnsafeBuffer.normalize(com.heerbann.unsafe.UnsafeBuffer.unsafe.getInt(array, baseOffset));
}