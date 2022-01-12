private void cleanRightChildren(int i) {
    for (int j = i; j < (childList.length); j++) {
        if ((childList[j]) != (-1)) {
            childList[j] = -1;
            (numChildren)--;
        }
    }
}