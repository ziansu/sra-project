private boolean cover(int[] relatedIndex) {
    for (int i = relatedIndex[0]; i < (relatedIndex[2]); i++) {
        for (int j = relatedIndex[1]; j < (relatedIndex[3]); j++) {
            if (region[j][i]) {
                return false;
            }else {
                region[j][i] = true;
            }
        }
    }
    return true;
}