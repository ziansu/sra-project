public boolean hasNext() {
    if ((this.index) > (this.menuSize)) {
        return false;
    }else {
        int tempIndex = this.index;
        while (tempIndex <= (this.menuSize)) {
            if ((menu.get(tempIndex).category) != (this.category)) {
                tempIndex += 1;
            }else {
                return true;
            }
        } 
        return false;
    }
}