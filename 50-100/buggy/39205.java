public void sort() {
    if ((data.get(j)) < (data.get(((j) - 1)))) {
        java.util.Collections.swap(data, j, ((j) - 1));
        (j)--;
        paintToParent(j);
    }else {
        j = 0;
        paintToParent();
    }
}