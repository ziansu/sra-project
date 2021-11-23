private void swim(int k) {
    while ((k > 1) && ((array[k]) < (array[(k / 2)]))) {
        swap(k, (k / 2));
        k = k / 2;
    } 
}