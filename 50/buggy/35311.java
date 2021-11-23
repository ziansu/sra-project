public boolean hasMain(bantam.visitor.Program ast) {
    ast.accept(this);
    return (hasClass) && (hasMethod);
}