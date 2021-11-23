public final void setY(double value) {
    y.set(value);
    peerBoundsConfigurator.setY(value);
    yExplicit = true;
}