private java.lang.Object[] allignWithTypes(java.lang.Object[] args) {
    int length = (args == null) ? 0 : args.length;
    java.lang.Object[] alligned = new java.lang.Object[length];
    java.lang.Class<?>[] expectedTypes = getParameterTypes();
    for (int i = 0; i < length; i++) {
        java.lang.Object obj = args[i];
        alligned[i] = align(obj, expectedTypes[i]);
    }
    return alligned;
}