public void add(org.openlca.ilcd.processes.AllocationFactor f) {
    if (f == null)
        return ;
    
    if ((allocations) == null) {
        allocations = new org.openlca.ilcd.processes.AllocationFactor[]{ f };
        return ;
    }
    org.openlca.ilcd.processes.AllocationFactor[] next = new org.openlca.ilcd.processes.AllocationFactor[(allocations.length) + 1];
    java.lang.System.arraycopy(allocations, 0, next, 0, allocations.length);
    next[allocations.length] = f;
    allocations = next;
}