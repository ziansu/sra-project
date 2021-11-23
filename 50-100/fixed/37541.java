private boolean sameEntries(int[] otherArray) {
    boolean same = true;
    for (int index = 0; index < (bagSize); index++) {
        if ((!(contains(bag[index], otherArray))) || (!(contains(otherArray[index], bag)))) {
            same = false;
        }
    }
    return same;
}