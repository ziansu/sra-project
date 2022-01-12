private boolean cover(int[] relatedIndex) {
    for (int i = relatedIndex[0]; i < (relatedIndex[2]); i++) {
        for (int j = relatedIndex[1]; j < (relatedIndex[3]); j++) {
            if (region[i][j]) {
                return false;
            }else {
                region[i][j] = true;
            }
        }
    }
    return true;
}