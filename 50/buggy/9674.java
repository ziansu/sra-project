private void checkIndexBoundsForNewElements(int index) {
    if ((index >= 0) && (index <= (size))) {
        return ;
    }else {
        throw new java.lang.IndexOutOfBoundsException();
    }
}