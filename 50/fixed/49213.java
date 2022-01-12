@java.lang.Override
public boolean canContinue(com.thoughtworks.go.config.CruiseConfig cruiseConfig) {
    return ((super.canContinue(cruiseConfig)) && (isIdSame())) && (isRequestFresh());
}