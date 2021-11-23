int getMaxEdgeWeight() {
    sortEdgeList();
    return this.edgeList.get(0).getWeight();
}