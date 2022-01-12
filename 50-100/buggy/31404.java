public static boolean compareToVetted(java.lang.String[] vettedArray, int valToCompare) {
    boolean isNotVetted = true;
    for (int i = 0; i < (vettedArray.length); i++) {
        int v = 1;
        if (valToCompare == (java.lang.Integer.parseInt(vettedArray[v]))) {
            isNotVetted = false;
            break;
        }
        v++;
    }
    return isNotVetted;
}