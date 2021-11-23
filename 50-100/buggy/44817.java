public org.inaetics.dronessimulator.common.D3Vector maximize_acceleration(org.inaetics.dronessimulator.common.D3Vector input) {
    org.inaetics.dronessimulator.common.D3Vector output = input;
    if ((input.length()) < (this.getMaxAcceleration())) {
        double correctionFactor = (input.length()) / (this.getMaxAcceleration());
        output = input.scale(correctionFactor);
    }
    return output;
}