private java.util.ArrayList<java.lang.Integer> neighboursOf(int vert) {
    java.util.ArrayList<java.lang.Integer> result = new java.util.ArrayList<java.lang.Integer>();
    for (int i = 0; i < (matrix[vert].length); i++) {
        if ((matrix[vert][i]) != 0) {
            result.add(i);
        }
    }
    return result;
}