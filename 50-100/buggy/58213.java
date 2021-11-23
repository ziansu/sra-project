public void remove(ListItem item) {
    int size = this.list.size();
    int idx = 0;
    while (idx < (size((!(this.list.get(idx).getItem().equals(item)))))) {
        idx += 1;
    } 
    if (idx < size)
        this.list.remove(idx);
    
}