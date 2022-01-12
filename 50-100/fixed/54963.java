private void removeRow(int preRow) {
    src.Cell cur;
    if (preRow == (-1))
        cur = getRow(((rowNum) - 1));
    else
        cur = getRow(preRow);
    
    for (int i = 0; i < (colNum); i++) {
        cur.down = cur.down.down;
        cur = cur.right;
    }
}