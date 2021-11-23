private void swim(int i) {
    if (i == 1) {
        return ;
    }
    int p = i / 2;
    if ((keys[p].compareTo(keys[i])) > 0) {
        exch(p, i);
        swim(p);
    }
}