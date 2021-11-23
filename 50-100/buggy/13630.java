public static java.util.List<java.lang.Process> createProcesses(java.util.List<com.hit.processes.ProcessCycles> appliocationsScenarios, com.hit.memoryunits.MemoryManagementUnit mmu) {
    java.util.List<java.lang.Process> processesList = new java.util.ArrayList<java.lang.Process>();
    int id = 1;
    for (com.hit.processes.ProcessCycles processCycles : appliocationsScenarios) {
        java.lang.Process p1 = new java.lang.Process((++id), mmu, processCycles);
        processesList.add(p1);
    }
    return processesList;
}