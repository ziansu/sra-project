@org.jetbrains.annotations.NotNull
@java.lang.Override
protected edu.clemson.rsrg.relemu.model.OMObject withSubOMObjectReplaced(int index, edu.clemson.rsrg.relemu.model.OMObject o) {
    java.util.List<edu.clemson.rsrg.relemu.model.OMExpression> newExpressions = new java.util.LinkedList(expressions);
    if ((index >= 0) && (index < (expressions.size()))) {
        newExpressions.set(index, ((edu.clemson.rsrg.relemu.model.OMExpression) (o)));
    }
    return new edu.clemson.rsrg.relemu.model.OMStatement.OMRememberStatement(getLocation(), newExpressions);
}