private static java.lang.String findIndexOfSubBoard(int subBoard) {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            subBoard--;
            if (subBoard == 0) {
                return ("" + i) + j;
            }
        }
    }
    return null;
}