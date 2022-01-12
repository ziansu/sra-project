public void insert(java.lang.Object item, int ord) {
    int size = this.list.size();
    int idx = 0;
    while ((idx < size) && ((this.list.get(idx).getOrd()) < ord)) {
        idx += 1;
    } 
    this.list.add(idx, new ListItem(item, ord));
}