private int howManyNeighborsAlive() {
    int howManyNeighborsAlive = 0;
    for (int i = 0; i < (mNeighbors.size()); i++) {
        if ((mNeighbors.get(i).getIsAlive()) == true)
            howManyNeighborsAlive++;
        
    }
    return howManyNeighborsAlive;
}