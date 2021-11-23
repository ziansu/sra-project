private int computeMaxHeight() {
    for (int i = 0; i < (heightOfColumes.length); i++) {
        if ((maxHeight) < (heightOfColumes[i])) {
            maxHeight = heightOfColumes[i];
        }
    }
    return maxHeight;
}