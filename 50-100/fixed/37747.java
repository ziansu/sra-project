private java.lang.Process getProcessOfSpecifiedStateAndPriority(test.management.memory.memory_management.process.ProcessState state, test.management.memory.memory_management.process.ProcessPriority priority) {
    java.lang.Process process = null;
    for (test.management.memory.memory_management.ProcessTableEntry entry : entries) {
        process = entry.getProcess();
        if ((process.getProcessState().equals(state)) && (process.getProcessPriority().equals(priority))) {
            return process;
        }
    }
    return null;
}