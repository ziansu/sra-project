public static java.lang.String replaceNonLetter(java.lang.String line) {
    for (char c : line.toCharArray()) {
        if (((c < 65) || ((c > 90) && (c < 97))) || (c > 122)) {
            line.replace(c, ' ');
        }
    }
    return line;
}