public java.util.List<java.lang.Integer> elementMapPosition(java.util.List<java.lang.Integer> array) {
    java.util.List<java.lang.Integer> list = new java.util.ArrayList<java.lang.Integer>(java.util.Collections.nCopies(array.size(), 0));
    for (int i = 0; i < (array.size()); i++) {
        list.add(array.get(i), i);
    }
    return list;
}