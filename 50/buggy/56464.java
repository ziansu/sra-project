private void configureMethod(dyvil.tools.compiler.ast.method.IMethod method, dyvil.tools.parsing.token.IToken token) {
    method.setPosition(token.raw());
    method.setModifiers(this.modifiers);
    this.modifiers = null;
}