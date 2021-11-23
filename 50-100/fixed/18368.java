@java.lang.Override
public weka.core.Capabilities getCapabilities() {
    weka.core.Capabilities result = super.getCapabilities();
    result.disableAll();
    result.enable(Capability.NOMINAL_ATTRIBUTES);
    result.enable(Capability.NOMINAL_CLASS);
    result.enable(Capability.MISSING_CLASS_VALUES);
    result.setMinimumNumberInstances(0);
    return result;
}