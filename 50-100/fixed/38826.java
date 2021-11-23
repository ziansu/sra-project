public java.lang.String getOutputNames(edu.wpi.grip.core.Step step) {
    java.lang.StringBuilder out = new java.lang.StringBuilder();
    for (edu.wpi.grip.core.sockets.OutputSocket output : step.getOutputSockets()) {
        out.append((((("    " + (output.getSocketHint().getType().getSimpleName())) + ": ") + (output.getSocketHint().getIdentifier())) + " \n"));
    }
    return out.toString();
}