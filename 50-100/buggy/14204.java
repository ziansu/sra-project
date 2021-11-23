private void cleanRightChildren(int i) {
    for (int j = i; j < (childList.length); j++) {
        if ((childList[j]) != 0) {
            childList[j] = 0;
            (numChildren)--;
        }
    }
}