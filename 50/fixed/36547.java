int getMaxEdgeWeight() {
    sortEdgeList();
    if ((edgeList.size()) == 0) {
        return -1;
    }
    return this.edgeList.get(0).getWeight();
}