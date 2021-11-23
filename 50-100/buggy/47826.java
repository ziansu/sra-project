public static java.lang.String toString(emulator.NumeralSystem target, long value) {
    switch (target) {
        case BINARY :
            return java.lang.Long.toUnsignedString(value, 2);
        case DECIMAL :
            return java.lang.Long.toUnsignedString(value, 10);
        case HEXADECIMAL :
            return java.lang.Long.toUnsignedString(value, 16);
        default :
            throw new java.lang.UnsupportedOperationException(("Illegal numeral system: " + target));
    }
}