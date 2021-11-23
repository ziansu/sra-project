public final void setX(double value) {
    x.set(value);
    peerBoundsConfigurator.setX(value);
    xExplicit = true;
}