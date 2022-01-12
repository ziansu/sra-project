@java.lang.Override
public org.micromanager.plugins.magellan.propsandcovariants.CovariantValue getLowerLimit() {
    if (isInteger()) {
        return new org.micromanager.plugins.magellan.propsandcovariants.CovariantValue(((int) (lowerLimit)));
    }else {
        return new org.micromanager.plugins.magellan.propsandcovariants.CovariantValue(lowerLimit);
    }
}