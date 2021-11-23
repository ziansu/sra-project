public static boolean compareToVetted(java.lang.String[] vettedArray, int valToCompare) {
    boolean isNotVetted = true;
    int v = 1;
    for (int i = 1; i < (vettedArray.length); i++) {
        if (valToCompare == (java.lang.Integer.parseInt(vettedArray[i]))) {
            isNotVetted = false;
            v++;
        }
    }
    return isNotVetted;
}