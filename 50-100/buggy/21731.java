public void removeAt(int index) {
    if (!(checkIndex(index, structures.TArray.ActionType.AT_ACCESS))) {
        throw new java.lang.IndexOutOfBoundsException("Invalid index");
    }
    java.lang.System.arraycopy(array, (index + 1), array, index, ((getSize()) - index));
    (used)--;
}