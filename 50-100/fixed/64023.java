@java.lang.Override
public void visit(final boa.compiler.visitors.FixPExpression n, final boa.compiler.SymbolTable env) {
    n.env = env;
    n.getType().accept(this, env);
    fixPChecker.start(n);
    n.getBody().accept(this, env);
    n.type = n.getType().type;
}