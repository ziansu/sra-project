public java.lang.String getOutputNames(edu.wpi.grip.core.Step step) {
    java.lang.String out = "";
    for (edu.wpi.grip.core.sockets.OutputSocket output : step.getOutputSockets()) {
        out += ((("    " + (output.getSocketHint().getType().getSimpleName())) + ": ") + (output.getSocketHint().getIdentifier())) + " \n";
    }
    return out;
}