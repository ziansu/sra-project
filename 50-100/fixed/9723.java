private void pushUp(int i) {
    while ((i > 1) && ((compare2(heap.get(i), heap.get((i / 2)))) > 0)) {
        swap(i, (i / 2));
        i /= 2;
    } 
}