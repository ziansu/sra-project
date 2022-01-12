private int findId(java.lang.String findTitle) {
    for (int i = 0; i < ((myArrayList.size()) - 1); i++) {
        java.lang.System.out.println(myArrayList.size());
        if (myArrayList.get(i).getTitle().contains(findTitle)) {
            return i;
        }
    }
    return -1;
}