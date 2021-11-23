private static <X> X readEnum(java.lang.Class<X> enumClass, int idx) throws java.io.IOException {
    try {
        return idx == 0 ? null : enumClass.getEnumConstants()[(idx - 1)];
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        throw new java.io.IOException("Invalid enum value");
    }
}