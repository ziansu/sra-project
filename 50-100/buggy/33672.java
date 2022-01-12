@java.lang.Override
public lupos.engine.operators.messages.Message preProcessMessage(final lupos.engine.operators.messages.BoundVariablesMessage msg) {
    final lupos.engine.operators.messages.BoundVariablesMessage result = ((lupos.engine.operators.messages.BoundVariablesMessage) (index.preProcessMessage(msg)));
    result.getVariables().removeAll(msg.getVariables());
    unionVariables = new java.util.HashSet<lupos.datastructures.items.Variable>(result.getVariables());
    intersectionVariables = new java.util.HashSet<lupos.datastructures.items.Variable>(unionVariables);
    return result;
}