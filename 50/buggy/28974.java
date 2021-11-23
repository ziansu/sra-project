public boolean hasNext() {
    if ((totalRecordCount) > ((from) + (position))) {
        return true;
    }else {
        return false;
    }
}