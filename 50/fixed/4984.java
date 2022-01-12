@java.lang.Override
public void accept(expressiontree.utils.IRVisitor visitor) {
    condition.accept(visitor);
    thenPart.accept(visitor);
    if ((elsePart) != null)
        elsePart.accept(visitor);
    
    visitor.visit(this);
}