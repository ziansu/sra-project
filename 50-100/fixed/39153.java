public void next() {
    this.index += 1;
    int tempIndex = this.index;
    while (((this.index) < (this.menuSize)) && ((menu.get(tempIndex).category) != (this.category))) {
        this.index += 1;
        tempIndex += 1;
    } 
}