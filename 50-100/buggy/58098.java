@java.lang.Override
public com.brweber2.ast.StackEffect getStackEffect(com.brweber2.type.TypeStack typeStack) {
    com.brweber2.ast.StackEffect se = new com.brweber2.ast.StackEffect();
    com.brweber2.ast.Symbol a = typeStack.peek((-1)).toSymbol();
    com.brweber2.ast.Symbol b = typeStack.peek((-2)).toSymbol();
    se.add(a);
    se.add(b);
    se.addArrow();
    se.add(b);
    se.add(a);
    return se;
}