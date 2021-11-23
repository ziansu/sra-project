@java.lang.Override
public java.lang.String toString() {
    char offset = 'A' - '0';
    char base = '0';
    return ("" + ((char) (((column) + offset) + base))) + ((char) (((row) + 1) + base));
}