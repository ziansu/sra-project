private boolean addValueToActualList(int value) {
    if (this.testFilter(value)) {
        if (!(this.contains(value))) {
            this.actualList.add(value);
            return true;
        }
    }else {
        this.actualList.add(value);
        return true;
    }
    return false;
}