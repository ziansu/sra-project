private int count(liu.janva.AbstractBoardIterator iter) {
    int totalInRow = 0;
    while ((iter.hasNext()) && (markSame(((int) (iter.next()))))) {
        ++totalInRow;
    } 
    return totalInRow;
}