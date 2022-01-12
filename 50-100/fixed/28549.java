@java.lang.Override
public IF4071.DecisionTreeLearning.MyC45.Capabilities getCapabilities() {
    IF4071.DecisionTreeLearning.MyC45.Capabilities result = super.getCapabilities();
    result.disableAll();
    result.enable(Capabilities.Capability.NOMINAL_ATTRIBUTES);
    result.enable(Capabilities.Capability.NUMERIC_ATTRIBUTES);
    result.enable(Capabilities.Capability.DATE_ATTRIBUTES);
    result.enable(Capabilities.Capability.MISSING_VALUES);
    result.enable(Capabilities.Capability.NOMINAL_CLASS);
    result.enable(Capabilities.Capability.MISSING_CLASS_VALUES);
    result.setMinimumNumberInstances(0);
    return result;
}