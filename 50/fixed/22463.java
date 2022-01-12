public float getDisplacementX() {
    return board_capabilities.isDisplacementSupported() ? displacement[0] : integrator.getDisplacementX();
}