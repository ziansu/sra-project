public static java.lang.String intToSquare(int squareNumber) {
    if (squareNumber == (-1)) {
        return "-";
    }
    java.lang.StringBuilder buffer = new java.lang.StringBuilder();
    buffer.append(((char) ((squareNumber % 8) + 'a')));
    buffer.append((8 - (squareNumber / 8)));
    return java.lang.String.valueOf(buffer);
}