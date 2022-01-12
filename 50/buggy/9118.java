public static long nmemAlloc(long size) {
    return org.lwjgl.system.MemoryUtil.ALLOCATOR.malloc(size);
}