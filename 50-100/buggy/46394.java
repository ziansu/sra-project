public static java.lang.String[] addStringToArray(java.lang.String[] array, java.lang.String value) {
    java.lang.String[] newArray = new java.lang.String[0];
    if ((array.length) > 0) {
        for (int i = 0; i < (array.length); i++) {
            newArray[i] = array[i];
        }
        newArray[array.length] = value;
    }
    return newArray;
}