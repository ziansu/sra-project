public int getIndexFromValue(int[] list, int v) {
    for (int i = 0; i != (list.length); i++) {
        if ((list[i]) == v)
            return i;
        
    }
    return 0;
}