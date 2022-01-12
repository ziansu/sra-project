public ClassB.NestedClass visit(ast.ExpCore.ClassB.NestedClass nc) {
    java.util.List<java.lang.String> old = path;
    path = new java.util.ArrayList<>(path);
    path.add(nc.getName());
    assert (nc.getInner()) instanceof ast.ExpCore.ClassB : "CloneWithPath works only for compiled classes, to deal with paths + class literals in methods";
    try {
        return super.visit(nc);
    } finally {
        path = old;
    }
}