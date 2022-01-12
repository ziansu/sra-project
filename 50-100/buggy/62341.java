public static java.lang.String binaryStringToString(java.lang.String binaryString) {
    java.lang.String evaluated = "";
    for (int i = 0; (i * 16) < (binaryString.length()); i++) {
        evaluated += ((char) (Converter.binaryStringToInt(binaryString.substring((i * 16), ((i + 1) * 16)))));
    }
    return evaluated;
}