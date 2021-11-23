public boolean hasMain(bantam.visitor.Program ast) {
    ast.accept(this);
    return (this.hasClass) && (this.hasMethod);
}