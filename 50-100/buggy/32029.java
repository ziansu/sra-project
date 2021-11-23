private void siftUpUsingComparator(int k, AnyType item) {
    while (k > 0) {
        int parent = (k - 1) >>> 1;
        java.lang.Object e = queue[parent];
        if ((comparator.compare(((AnyType) (e)), item)) >= 0)
            break;
        
        queue[k] = e;
        k = parent;
    } 
    queue[k] = item;
}