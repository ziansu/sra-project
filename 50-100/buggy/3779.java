@java.lang.Override
public java.lang.String toString() {
    final char offset = 'A' - '0';
    final char base = '0';
    return ("" + ((char) (((column) + offset) + base))) + ((char) (((((Constants.BOARD_LENGTH) - 1) - (row)) + 1) + base));
}