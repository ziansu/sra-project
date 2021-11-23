public boolean compareTo(booleanArray other, double percent) {
    for (int i = 0; i < (booleanArrs.length); i++) {
        if (booleanArrs[i].compareTo(other, percent)) {
            index = i;
            return true;
        }
    }
    return false;
}