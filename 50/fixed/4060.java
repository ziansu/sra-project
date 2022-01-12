public synchronized void unregisterThread(com.oracle.truffle.llvm.nodes.base.LLVMThreadNode thread) {
    runningThreads.remove(thread);
    assert !(runningThreads.contains(thread));
}