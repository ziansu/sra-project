public float getDisplacementY() {
    return board_capabilities.isDisplacementSupported() ? displacement[1] : integrator.getDisplacementY();
}