@java.lang.Override
public boolean doIsEquals(com.github.javaparser.ast.expr.AssignExpr first, com.github.javaparser.ast.expr.AssignExpr second) {
    if (!(isEqualsUseMerger(first.getTarget(), second.getTarget())))
        return false;
    
    if (!(isEqualsUseMerger(first.getValue(), second.getValue())))
        return false;
    
    if (!(first.getOperator().equals(second.getOperator())))
        return false;
    
    return true;
}