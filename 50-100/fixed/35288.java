public int getAllocation(int depth) {
    int localAllocation = getLocalAllocation();
    if (((directSubordinates) != null) && (!(depth < 0))) {
        for (Employee e : directSubordinates) {
            localAllocation += e.getAllocation((depth - 1));
        }
    }
    return localAllocation;
}