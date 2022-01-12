private void addParameters(java.util.Map<java.lang.String, java.lang.String> params, net.peakgames.libgdx.stagebuilder.core.AbstractScreen screen) {
    if (params != null) {
        if ((screen.parameters) != null) {
            params.putAll(screen.parameters);
        }
        screen.setParameters(params);
    }
}