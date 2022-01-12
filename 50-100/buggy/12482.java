private int findId(java.lang.String findTitle) {
    for (int i = 0; i < (myArrayList.size()); i++) {
        if (myArrayList.get(i).getTitle().matches(findTitle)) {
            return i;
        }
    }
    return 0;
}