public int getIdFromIndex(int index) {
    if ((index >= (importantList.size())) || (index < 1)) {
        return -1;
    }
    return importantList.get(index).getItem().getId();
}