public int remove(loon.component.LComponent comp) {
    final int size = this.childCount;
    for (int i = size - 1; i > (-1); i--) {
        if ((this.childs[i]) == comp) {
            this.remove(i);
            return i;
        }
    }
    return -1;
}