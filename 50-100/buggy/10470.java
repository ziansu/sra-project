public int hamming() {
    int count = 0;
    for (int i = 0; i < (N); i++) {
        for (int j = 0; j < (N); j++) {
            if ((pieces[i][j]) != (goalValueAt(i, j))) {
                count++;
            }
        }
    }
    return count;
}