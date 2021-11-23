public static java.lang.String printArray(int[] array) {
    if ((array.length) == 0) {
        return "[]";
    }
    java.lang.String output = "[" + (array[0]);
    for (int i = 1; i < (array.length); i++) {
        output += ", " + (array[i]);
    }
    output += "]";
    return output;
}