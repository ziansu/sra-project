private static com.google.javascript.rhino.Node getEnclosingDeclNameNode(com.google.javascript.rhino.Node n) {
    com.google.javascript.rhino.Node fn = com.google.javascript.jscomp.NodeUtil.getEnclosingFunction(n);
    return fn == null ? null : com.google.javascript.jscomp.NodeUtil.getFunctionNameNode(fn);
}