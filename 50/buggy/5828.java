private float calculateBrakepedalDeceleration() {
    return ((bus.getBrakePedal()) / 100.0F) * (BRAKE_PEDAL_DECELERATION_COEFFICIENT);
}