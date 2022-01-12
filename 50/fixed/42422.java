public static long parseLong(java.lang.String longProperty) {
    try {
        return java.lang.Long.parseLong(longProperty);
    } catch (java.lang.NumberFormatException nfe) {
        throw new java.lang.RuntimeException(((longProperty + " not a number. ") + (nfe.getMessage())));
    }
}