private int getIndexForMinFile() {
    int pointerToMinIndex = 0;
    for (int i = 1; i < (keys.size()); i++) {
        if ((keys.get(pointerToMinIndex).toString().compareTo(keys.get(i).toString())) > 0)
            pointerToMinIndex = i;
        
    }
    return pointerToMinIndex;
}