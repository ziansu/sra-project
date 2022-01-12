@java.lang.Override
public lupos.engine.operators.messages.Message preProcessMessage(final lupos.engine.operators.messages.BoundVariablesMessage msg) {
    final lupos.engine.operators.messages.BoundVariablesMessage result = ((lupos.engine.operators.messages.BoundVariablesMessage) (this.index.preProcessMessage(msg)));
    result.getVariables().removeAll(msg.getVariables());
    this.unionVariables = new java.util.HashSet<lupos.datastructures.items.Variable>(result.getVariables());
    this.intersectionVariables = new java.util.HashSet<lupos.datastructures.items.Variable>(this.unionVariables);
    return result;
}