public int hash3(java.lang.String key) {
    int hashVal = 0;
    for (int i = 0; i < (key.length()); i++) {
        hashVal = (37 * hashVal) + (key.charAt(i));
    }
    return java.lang.Math.abs((hashVal % (HashFunctions.TABLESIZE)));
}