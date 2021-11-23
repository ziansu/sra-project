public void addAll(int craneId, java.util.ArrayList<java.lang.Integer> containers) {
    plan[craneId] = containers;
    nContainers += containers.size();
}