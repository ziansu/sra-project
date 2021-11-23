public void setStabilityLength(java.lang.Integer length) {
    java.lang.Integer old = this.properties.stabilityLength;
    properties.stabilityLength = ((ec.nbdemetra.ui.DemetraUI.STABILITY_LENGTH) != null) ? length : ec.nbdemetra.ui.DemetraUI.STABILITY_LENGTH.defaultValue();
    firePropertyChange(ec.nbdemetra.ui.DemetraUI.STABILITY_YEARS_PROPERTY, old, properties.stabilityLength);
}