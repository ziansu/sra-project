@java.lang.Override
public com.brweber2.ast.StackEffect getStackEffect(com.brweber2.type.TypeStack typeStack) {
    com.brweber2.ast.StackEffect stackEffect = new com.brweber2.ast.StackEffect();
    stackEffect.addArrow();
    stackEffect.add(typeStack.peek((-1)).toSymbol());
    return stackEffect;
}