public void buildVelocityPlan() {
    wayLengthCurrent = 0.0;
    wayLengthAcceleration = motionmachinesimulator.Processor.ControllerSettings.getWayLength4StepChange(stepSizeConstantVelocity, stepSizeBeforeAcceleration);
    wayLengthDeceleration = motionmachinesimulator.Processor.ControllerSettings.getWayLength4StepChange(stepSizeConstantVelocity, stepSizeAfterDeceleration);
    wayLengthConstantVelocity = ((wayLength) - (wayLengthAcceleration)) - (wayLengthDeceleration);
    if ((wayLengthConstantVelocity) < 0.0) {
        wayLengthAcceleration += (wayLengthConstantVelocity) / 2;
        wayLengthDeceleration += (wayLengthConstantVelocity) / 2;
        wayLengthConstantVelocity = 0.0;
    }
}