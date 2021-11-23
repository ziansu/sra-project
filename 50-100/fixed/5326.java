public int getIdFromIndex(int index) {
    if ((index < 0) || (((importantList.size()) - 1) < index)) {
        return -1;
    }
    return importantList.get(index).getItem().getId();
}