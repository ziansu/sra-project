private void allocate(final long stackSize) {
    com.oracle.truffle.api.CompilerAsserts.neverPartOfCompilation();
    if (!(isFreed)) {
        throw new java.lang.AssertionError("previously not deallocated");
    }
    final long stackAllocation = com.oracle.truffle.llvm.runtime.memory.LLVMStack.UNSAFE.allocateMemory(stackSize);
    lowerBounds = stackAllocation;
    upperBounds = stackAllocation + stackSize;
    isFreed = false;
    stackPointer = upperBounds;
}