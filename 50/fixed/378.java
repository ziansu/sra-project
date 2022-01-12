public boolean isLegal(int id) {
    if ((this.oldIds.indexOf(id)) == (-1)) {
        return true;
    }else {
        return false;
    }
}