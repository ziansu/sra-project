public float calculateAcceleration() {
    float gearacceleration = this.getGearAcceleration();
    float gaspedalacceleration = this.calculateGaspedalAcceleration();
    float enginebrakedecleration = this.calculateEngineBrakeDeceleration();
    float brakepedaldeceleration = this.calculateBrakepedalDeceleration();
    float staticdecleration = STATIC_DECELERATION_COEFFICIENT;
    float gasacceleration = gaspedalacceleration * gearacceleration;
    float decelerationsum = (enginebrakedecleration + brakepedaldeceleration) + staticdecleration;
    float accelerationsum = gasacceleration - decelerationsum;
    return accelerationsum;
}