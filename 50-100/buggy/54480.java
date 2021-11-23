private int count(liu.janva.AbstractBoardIterator iter) {
    int totalInRow = 0;
    while ((iter.hasNext()) && (markSame(((int) (iter.next()))))) {
        if (isFiveInARow(((++totalInRow) + 1))) {
            break;
        }
    } 
    return totalInRow;
}