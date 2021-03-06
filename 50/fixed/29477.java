public void pauseAllThreadsAndExecuteFromNonRubyThread(com.oracle.truffle.api.nodes.Node currentNode, org.jruby.truffle.runtime.subsystems.SafepointAction action) {
    enterThread();
    try {
        pauseAllThreadsAndExecute(currentNode, false, action);
    } finally {
        leaveThread();
    }
}