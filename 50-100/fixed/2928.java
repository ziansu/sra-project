@java.lang.Override
public void getRange(epmc.value.Value range, epmc.graph.StateSet of) {
    epmc.value.Value min = applyOver(OperatorMin.MIN, of);
    epmc.value.Value max = applyOver(OperatorMax.MAX, of);
    epmc.value.OperatorEvaluator set = epmc.value.ContextValue.get().getEvaluator(OperatorSet.SET, type, epmc.value.TypeReal.get());
    set.apply(epmc.value.ValueInterval.as(range).getIntervalLower(), min);
    set.apply(epmc.value.ValueInterval.as(range).getIntervalUpper(), max);
}