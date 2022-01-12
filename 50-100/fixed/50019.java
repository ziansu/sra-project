public int searchTag() {
    for (int i = 0; i < (this.size); i++) {
        int tag = elementList[i].searchTag();
        if (tag != (-1)) {
            return tag;
        }
    }
    return -1;
}