public void next() {
    this.index += 1;
    int tempIndex = this.index;
    while (((menu.get(tempIndex).heartHealthy) != true) && ((this.index) < (this.menuSize))) {
        this.index += 1;
        tempIndex += 1;
    } 
}