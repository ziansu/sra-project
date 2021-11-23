public java.lang.String stepNames(edu.wpi.grip.core.Pipeline pipeline) {
    java.lang.String out = "";
    for (edu.wpi.grip.core.Step step : getSteps(pipeline)) {
        out += (step.getOperationDescription().name()) + " \n";
        out += getInputNames(step);
        out += getOutputNames(step);
    }
    return out;
}