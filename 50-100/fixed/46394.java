public static java.lang.String[] addStringToArray(java.lang.String[] array, java.lang.String value) {
    java.lang.String[] newArray = new java.lang.String[(array.length) + 1];
    for (int i = 0; i < (array.length); i++) {
        newArray[i] = array[i];
    }
    newArray[array.length] = value;
    return newArray;
}