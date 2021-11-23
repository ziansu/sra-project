private void f(java.lang.String identifier, java.lang.String original) {
    java.util.List<java.lang.String> dependencies = getAllDependencies(identifier);
    if (dependencies == null) {
        return ;
    }
    if (dependencies.contains(original)) {
        java.lang.System.out.println(java.lang.String.format("Cyclic between: %s and %s", original, identifier));
        return ;
    }
    for (java.lang.String d : dependencies) {
        f(d, original);
    }
}