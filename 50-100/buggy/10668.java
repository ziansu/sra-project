@java.lang.Override
public void visit(final boa.compiler.visitors.FixPStatement n) {
    final java.util.Set<java.lang.String> s = befores;
    final boa.compiler.visitors.Identifier id = ((boa.compiler.visitors.Identifier) (n.getParam1().getType()));
    final java.lang.String token = id.getToken();
    s.add(token);
    final boa.compiler.visitors.Identifier id1 = ((boa.compiler.visitors.Identifier) (n.getParam2().getType()));
    final java.lang.String token1 = id1.getToken();
    s.add(token1);
}