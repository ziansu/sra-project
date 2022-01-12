public void setStabilityLength(java.lang.Integer length) {
    java.lang.Integer old = this.properties.stabilityLength;
    properties.stabilityLength = (length != null) ? length : ec.nbdemetra.ui.DemetraUI.STABILITY_LENGTH.defaultValue();
    firePropertyChange(ec.nbdemetra.ui.DemetraUI.STABILITY_YEARS_PROPERTY, old, properties.stabilityLength);
}