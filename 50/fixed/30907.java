@java.lang.Override
public boolean canRunEx() {
    if (!(initialized)) {
        initializing = true;
        return true;
    }
    return PVPAppeared.checkValueChangedSometime(super.canRunEx());
}