private java.util.ArrayList<java.lang.Boolean> multiplication(java.util.ArrayList<java.lang.Boolean> multiplicand, java.util.ArrayList<java.lang.Boolean> multiplier) {
    java.util.ArrayList<java.lang.Boolean> result = new java.util.ArrayList<java.lang.Boolean>();
    result.add(false);
    for (int i = 0; i != (multiplier.size()); i++) {
        if ((multiplier.get(i)) == true) {
            result = addition(result, multiplicand, i);
        }
    }
    return result;
}