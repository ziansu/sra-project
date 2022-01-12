@java.lang.Override
public boolean visit(com.google.devtools.j2objc.ast.NumberLiteral node) {
    java.lang.String text = node.getToken();
    sb.print((text != null ? text : node.getValue().toString()));
    return false;
}