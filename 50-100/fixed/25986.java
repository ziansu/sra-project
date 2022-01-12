public org.inaetics.dronessimulator.common.vector.D3Vector maximize_acceleration(org.inaetics.dronessimulator.common.vector.D3Vector input) {
    org.inaetics.dronessimulator.common.vector.D3Vector output = input;
    if (((input.length()) < (this.getMaxAcceleration())) && ((input.length()) != 0)) {
        double correctionFactor = (this.getMaxAcceleration()) / (input.length());
        output = input.scale(correctionFactor);
    }
    return output;
}