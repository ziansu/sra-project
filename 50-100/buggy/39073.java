@java.lang.Override
public void getImplicitMatches(dyvil.tools.compiler.ast.method.MatchList<dyvil.tools.compiler.ast.method.IMethod> list, dyvil.tools.compiler.ast.expression.IValue value, dyvil.tools.compiler.ast.type.IType targetType) {
    this.inner.getImplicitMatches(list, value, targetType);
    if (!(list.hasCandidate())) {
        this.outer.getImplicitMatches(list, value, targetType);
    }
}