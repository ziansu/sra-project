public static void setBuiltins(java.util.Collection<java.lang.String> builtins) {
    org.apache.pig.contrib.eclipse.OpenDeclarationHandler.BUILTINS = new java.util.HashSet<java.lang.String>();
    for (java.lang.String b : builtins) {
        org.apache.pig.contrib.eclipse.OpenDeclarationHandler.BUILTINS.add(b);
    }
}