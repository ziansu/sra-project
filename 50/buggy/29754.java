@java.lang.Override
public boolean visit(org.eclipse.jdt.core.dom.MethodRefParameter node) {
    java.lang.System.out.println(((node.getName()) + "ref"));
    return super.visit(node);
}