public int hamming() {
    int dist = 0;
    for (int i = 0; i < (n); i++) {
        for (int j = 0; j < (n); j++) {
            if ((tiles[i][j]) != (goal[i][j])) {
                dist += 1;
            }
        }
    }
    return dist;
}