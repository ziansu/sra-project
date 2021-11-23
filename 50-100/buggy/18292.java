public int remove(loon.component.LComponent comp) {
    for (int i = 0; i < (this.childCount); i++) {
        if ((this.childs[i]) == comp) {
            this.remove(i);
            return i;
        }
    }
    return -1;
}