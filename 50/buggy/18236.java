private void fixLineNumbers(com.google.javascript.rhino.Node expr) {
    expr.setLineno((((expr.getLineno()) + (templateLineno)) - 1));
    for (com.google.javascript.rhino.Node child : expr.children()) {
        fixLineNumbers(child);
    }
}