@java.lang.Override
public void activate() {
    super.activate();
    redrawPinArrow((getTargetConnections().isEmpty() ? getSourceConnections() : getTargetConnections()));
}