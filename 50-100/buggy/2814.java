private boolean shouldStopContainer(org.jolokia.docker.maven.model.Container container, org.jolokia.docker.maven.util.PomLabel pomLabel) {
    boolean stopContainer = true;
    if (!(isStopAllContainers())) {
        java.lang.String key = pomLabel.getKey();
        java.util.Map<java.lang.String, java.lang.String> labels = container.getLabels();
        if (labels.containsKey(key)) {
            stopContainer = pomLabel.matches(new org.jolokia.docker.maven.util.PomLabel(labels.get(key)));
        }
    }
    return stopContainer;
}