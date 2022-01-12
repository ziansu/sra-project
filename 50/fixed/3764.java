private int findEmptyProperty() {
    for (int houseNumber = 0; houseNumber < (this.totalProperty); houseNumber++) {
        if ((this.houses[houseNumber]) == null) {
            return houseNumber;
        }
    }
    return -1;
}