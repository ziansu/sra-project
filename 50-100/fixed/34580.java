private int computeMaxHeight() {
    maxHeight = 0;
    for (int i = 0; i < (heightOfColumes.length); i++) {
        if ((maxHeight) < (heightOfColumes[i])) {
            maxHeight = heightOfColumes[i];
        }
    }
    return maxHeight;
}