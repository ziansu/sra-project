public java.lang.String stepNames(edu.wpi.grip.core.Pipeline pipeline) {
    java.lang.StringBuilder out = new java.lang.StringBuilder();
    for (edu.wpi.grip.core.Step step : getSteps(pipeline)) {
        out.append(((step.getOperationDescription().name()) + " \n"));
        out.append(getInputNames(step));
        out.append(getOutputNames(step));
    }
    return out.toString();
}