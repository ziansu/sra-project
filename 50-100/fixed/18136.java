private static java.util.ArrayList<java.lang.String> reverse(java.util.ArrayList<java.lang.String> array) {
    java.util.ArrayList<java.lang.String> reverse = new java.util.ArrayList<java.lang.String>();
    for (int i = (array.size()) - 1; i >= 0; i--) {
        reverse.add(array.get(i));
    }
    return reverse;
}