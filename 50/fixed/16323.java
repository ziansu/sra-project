private static int parseInt(java.lang.String intLiteral) {
    if (intLiteral.isEmpty()) {
        return 0;
    }
    return java.lang.Long.valueOf(intLiteral).intValue();
}