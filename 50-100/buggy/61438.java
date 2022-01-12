private java.lang.Object[] allignWithTypes(java.lang.Object[] args) {
    java.lang.Object[] alligned = new java.lang.Object[args.length];
    java.lang.Class<?>[] expectedTypes = getParameterTypes();
    for (int i = 0; i < (args.length); i++) {
        java.lang.Object obj = args[i];
        alligned[i] = align(obj, expectedTypes[i]);
    }
    return alligned;
}