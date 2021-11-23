public synchronized void registerThread(com.oracle.truffle.llvm.nodes.base.LLVMThreadNode thread) {
    runningThreads.add(thread);
}