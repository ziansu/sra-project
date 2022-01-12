private int getStartIndex() {
    int start = 0;
    double MAX = 0;
    for (int i = 0; i < (numOfCity); i++) {
        for (int j = 0; j < (numOfCity); j++) {
            if ((distance[i][j]) > MAX) {
                MAX = distance[i][j];
                start = i;
            }
        }
    }
    return start;
}