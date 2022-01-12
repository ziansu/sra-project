public static java.util.Vector<java.lang.Integer> insertInOrder(int n, java.util.Vector<java.lang.Integer> vector) {
    for (int i = 0; i < (vector.size()); i++) {
        if (n > (vector.get(i))) {
            vector.add(n, i);
            return vector;
        }
    }
    vector.add(n);
    return vector;
}