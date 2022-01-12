private void fixLineNumbers(com.google.javascript.rhino.Node expr) {
    expr.setLineno(((expr.getLineno()) + (templateLineno)));
    for (com.google.javascript.rhino.Node child : expr.children()) {
        fixLineNumbers(child);
    }
}