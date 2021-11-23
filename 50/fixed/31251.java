public void addAll(int craneId, java.util.ArrayList<java.lang.Integer> containers) {
    plan[craneId].addAll(containers);
    nContainers += containers.size();
}