@java.lang.Override
public void visit(final com.github.javaparser.ast.visitor.UnionType n, final java.lang.Object arg) {
    printJavaComment(n.getComment(), arg);
    boolean isFirst = true;
    for (com.github.javaparser.ast.visitor.ReferenceType element : n.getElements()) {
        element.accept(this, arg);
        if (isFirst) {
            isFirst = false;
        }else {
            printer.print(" | ");
        }
    }
}