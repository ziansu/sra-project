public static java.lang.String toString(emulator.NumeralSystem target, long value, int length) {
    switch (target) {
        case BINARY :
            return emulator.Misc.zeroFill(java.lang.Long.toUnsignedString(value, 2), length);
        case DECIMAL :
            return emulator.Misc.zeroFill(java.lang.Long.toUnsignedString(value, 10), length);
        case HEXADECIMAL :
            return emulator.Misc.zeroFill(java.lang.Long.toUnsignedString(value, 16).toUpperCase(), length);
        default :
            throw new java.lang.UnsupportedOperationException(("Illegal numeral system: " + target));
    }
}