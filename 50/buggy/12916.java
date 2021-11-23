@java.lang.Override
public boolean visit(com.google.devtools.j2objc.ast.NumberLiteral node) {
    sb.print(node.getToken());
    return false;
}