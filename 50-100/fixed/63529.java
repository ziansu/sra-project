private void addParameters(java.util.Map<java.lang.String, java.lang.String> params, net.peakgames.libgdx.stagebuilder.core.AbstractScreen screen) {
    if (params != null) {
        if (((screen.parameters) != null) && ((screen.parameters) instanceof java.util.HashMap)) {
            ((java.util.HashMap) (screen.parameters)).putAll(params);
        }else {
            screen.setParameters(params);
        }
    }
}