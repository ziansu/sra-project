public void addAll(int craneId, int[] containers) {
    plan[craneId] = new java.util.ArrayList<java.lang.Integer>();
    nContainers += containers.length;
    for (int c : containers)
        plan[craneId].add(c);
    
}