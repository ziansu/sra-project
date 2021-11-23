@java.lang.Override
public char charAt(int index) {
    if (index != 0) {
        throw new java.lang.StringIndexOutOfBoundsException(index);
    }
    return toCharacter();
}