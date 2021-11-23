@java.lang.Override
public void visit(final boa.compiler.visitors.FixPExpression n, final boa.compiler.SymbolTable env) {
    n.env = env;
    n.getType().accept(this, env);
    for (final boa.compiler.visitors.Statement s : n.getBody().getStatements())
        if (!(s instanceof boa.compiler.visitors.FixPStatement))
            throw new boa.compiler.TypeCheckException(s, "only FixP statements are allowed inside fix point bodies");
        
    
    fixPChecker.start(n);
    n.getBody().accept(this, env);
    n.type = n.getType().type;
}