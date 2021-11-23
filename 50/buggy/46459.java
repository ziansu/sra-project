@java.lang.Override
public org.micromanager.plugins.magellan.propsandcovariants.CovariantValue getLowerLimit() {
    return new org.micromanager.plugins.magellan.propsandcovariants.CovariantValue((isInteger() ? ((int) (lowerLimit)) : lowerLimit));
}