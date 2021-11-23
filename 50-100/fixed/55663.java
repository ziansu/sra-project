protected java.util.List<java.lang.Integer> calculateReplacementInteger(int size, int prime) {
    java.util.List<java.lang.Integer> list = new java.util.ArrayList<java.lang.Integer>();
    for (int i = 0; i < size; i++) {
        long aux = ((i + 1L) % size) * (prime % size);
        list.add(((int) (aux % size)));
    }
    return list;
}