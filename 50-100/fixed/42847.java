public void addDefaultMethod(com.sun.tools.javac.tree.JCTree.JCClassDecl type, com.sun.tools.javac.tree.JCTree.JCMethodDecl defaultMethod) {
    java.util.Set<java.util.Map.Entry<com.sun.tools.javac.tree.JCTree.JCClassDecl, com.sun.tools.javac.tree.JCTree.JCMethodDecl>> methods = defaultMethods.get(type.sym);
    if (methods == null) {
        methods = new java.util.HashSet<>();
        defaultMethods.put(type.sym, methods);
    }
    methods.add(new java.util.AbstractMap.SimpleEntry(type, defaultMethod));
}