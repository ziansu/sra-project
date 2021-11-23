public void bubbleSort() {
    int out;
    int in;
    for (out = 0; out < ((nElems) - 1); out++) {
        for (in = out + 1; in < (nElems); in++) {
            if ((a[out]) > (a[in]))
                swap(out, in);
            
        }
    }
}