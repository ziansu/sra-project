@java.lang.Override
public boolean shouldTraverse(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
    switch (n.getType()) {
        case com.google.javascript.rhino.Token.YIELD :
            visitYieldExpression(n);
            break;
        case com.google.javascript.rhino.Token.DO :
        case com.google.javascript.rhino.Token.FOR :
        case com.google.javascript.rhino.Token.WHILE :
            visitLoop(n);
            break;
        case com.google.javascript.rhino.Token.CASE :
            if (controlCanExit(n.getFirstChild())) {
                compiler.report(com.google.javascript.jscomp.JSError.make(n, Es6ToEs3Converter.CANNOT_CONVERT_YET, "Case statements that contain yields"));
                return false;
            }
            break;
    }
    return true;
}