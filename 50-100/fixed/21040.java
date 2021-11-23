public void freeStacks() {
    com.oracle.truffle.api.CompilerAsserts.neverPartOfCompilation();
    synchronized(this) {
        defaultStack.free();
        for (com.oracle.truffle.llvm.runtime.memory.LLVMStack s : threadToStack.values()) {
            if (!(s.isFreed())) {
                s.free();
            }
        }
    }
}