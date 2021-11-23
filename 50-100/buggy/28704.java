public boolean hasNext() {
    this.tempIndex = this.index;
    while ((this.tempIndex) <= (menuSize)) {
        if ((menu.get(this.tempIndex).heartHealthy) == true) {
            return true;
        }else {
            this.tempIndex += 1;
        }
    } 
    return false;
}