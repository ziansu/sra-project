public boolean addElement(java.lang.String s) {
    int old_size = this.size();
    if (this.get(0).equals(NO_ENTRIES)) {
        this.remove(0);
    }
    super.add(s);
    if ((this.size()) == old_size) {
        return false;
    }
    LAST_ELEMENT = (this.size()) - 1;
    return true;
}