public org.inaetics.dronessimulator.common.D3Vector maximize_acceleration(org.inaetics.dronessimulator.common.D3Vector input) {
    org.inaetics.dronessimulator.common.D3Vector output = input;
    if ((input.length()) < (this.getMaxAcceleration())) {
        double correctionFactor = (this.getMaxAcceleration()) / (input.length());
        output = input.scale(correctionFactor);
    }
    return output;
}