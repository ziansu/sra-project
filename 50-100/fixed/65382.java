@java.lang.Override
public info.fulloo.trygve.run_time.RTCode run() {
    if (firstIter_) {
        final java.util.Map<java.lang.String, info.fulloo.trygve.run_time.RTBreakableExpression> allBreakablesMap = parsingData_.breakableRTExpressions();
        associatedBreakable_ = allBreakablesMap.get(label_);
        assert null != (associatedBreakable_);
        breakExit_ = associatedBreakable_.breakExit();
        assert null != (breakExit_);
        firstIter_ = false;
    }
    if (associatedBreakable_.resultIsConsumed()) {
        RunTimeEnvironment.runTimeEnvironment_.pushStack(info.fulloo.trygve.run_time.RTExpression.lastExpressionResult_);
    }
    RunTimeEnvironment.runTimeEnvironment_.popDynamicScopeInstances(nestingLevelInsideBreakable_);
    return breakExit_;
}