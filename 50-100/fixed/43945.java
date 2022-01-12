public ClassB.NestedClass visit(ast.ExpCore.ClassB.NestedClass nc) {
    java.util.List<java.lang.String> old = path;
    path = new java.util.ArrayList<>(path);
    path.add(nc.getName());
    if (!((nc.getInner()) instanceof ast.ExpCore.ClassB)) {
        return nc;
    }
    try {
        return super.visit(nc);
    } finally {
        path = old;
    }
}