private static boolean containsString(java.lang.String[] array, java.lang.String string) {
    for (int i = 0; i < (array.length); i++) {
        if (array[i].equals(string)) {
            return true;
        }
    }
    return false;
}