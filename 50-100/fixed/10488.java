public void next() {
    this.index += 1;
    int tempIndex = this.index;
    while (((this.index) < (this.menuSize)) && ((menu.get(tempIndex).price) >= (this.price))) {
        this.index += 1;
        tempIndex += 1;
    } 
}