@java.lang.Override
protected java.lang.String createDescription() {
    final java.lang.String simpleCondition = org.freeplane.core.util.TextUtils.getText(ConditionFactory.FILTER_REGEXP);
    return org.freeplane.features.filter.condition.ConditionFactory.createDescription(attribute, simpleCondition, value, isMatchCase(), false);
}