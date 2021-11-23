public boolean hasNext() {
    if ((this.index) >= (this.menuSize)) {
        return false;
    }else {
        int tempIndex = this.index;
        while (tempIndex <= (menuSize)) {
            if ((menu.get(tempIndex).price) >= (this.price)) {
                tempIndex += 1;
            }else {
                return true;
            }
        } 
        return false;
    }
}