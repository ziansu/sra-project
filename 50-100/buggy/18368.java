@java.lang.Override
public weka.core.Capabilities getCapabilities() {
    weka.core.Capabilities initialCapabilities = super.getCapabilities();
    initialCapabilities.disableAll();
    initialCapabilities.enable(Capability.NOMINAL_ATTRIBUTES);
    initialCapabilities.enable(Capability.NOMINAL_CLASS);
    initialCapabilities.enable(Capability.MISSING_CLASS_VALUES);
    initialCapabilities.setMinimumNumberInstances(0);
    return initialCapabilities;
}