public boolean AreaAdjacency(int Area1, int Area2) {
    return this.ListArea.get((Area1--)).AreaAdjacency((Area2--));
}