protected java.util.ArrayList<java.lang.Integer> indexIn(java.lang.String a) {
    java.util.ArrayList<java.lang.Integer> index = new java.util.ArrayList<>();
    int col = nomi.indexOf(a);
    int size = nomi.size();
    int i;
    int j;
    for (i = 0; i < size; i++) {
        if ((matrix.getElement(i, col)) == 1)
            index.add(i);
        
    }
    return index;
}