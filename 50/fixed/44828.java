@java.lang.Override
public java.lang.String getText() {
    de.uni_hildesheim.sse.easy_producer.instantiator.model.buildlangModel.RuleCallExpression ex = getElement();
    java.lang.String result = ex.getQualifiedName();
    result += argumentsToString(ex, 0);
    return result;
}