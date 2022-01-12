public void removeAt(int index) {
    if (!(checkIndex(index, structures.TArray.ActionType.AT_ACCESS))) {
        throw new java.lang.IndexOutOfBoundsException("Invalid index");
    }
    if (index < ((getSize()) - 1)) {
        java.lang.System.arraycopy(array, (index + 1), array, index, ((getSize()) - index));
    }
    (used)--;
}