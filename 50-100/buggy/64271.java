private java.lang.String calc(java.lang.String input) {
    int strLength = input.length();
    if (strLength <= 2) {
        return input;
    }else {
        java.lang.String first = input.substring(0, (strLength - 3));
        java.lang.String second = input.subtring((strLength - 2), (strLength - 1));
        java.lang.String newName = second.concat(first);
        return newName;
    }
}