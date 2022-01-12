@com.oracle.truffle.api.CompilerDirectives.TruffleBoundary
private void allocate(final long stackSize) {
    if (!(isFreed)) {
        throw new java.lang.AssertionError("previously not deallocated");
    }
    final long stackAllocation = com.oracle.truffle.llvm.runtime.memory.LLVMStack.UNSAFE.allocateMemory(stackSize);
    lowerBounds = stackAllocation;
    upperBounds = stackAllocation + stackSize;
    isFreed = false;
    stackPointer = upperBounds;
}