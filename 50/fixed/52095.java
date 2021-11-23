@java.lang.Override
public void free(long ptr) {
    org.lwjgl.system.MemoryManage.DebugAllocator.untrack(ptr);
    allocator.free(ptr);
}