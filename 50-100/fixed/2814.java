private boolean shouldStopContainer(org.jolokia.docker.maven.model.Container container, org.jolokia.docker.maven.util.PomLabel pomLabel) {
    if (isStopAllContainers()) {
        return true;
    }
    java.lang.String key = pomLabel.getKey();
    java.util.Map<java.lang.String, java.lang.String> labels = container.getLabels();
    return (labels.containsKey(key)) && (pomLabel.matches(new org.jolokia.docker.maven.util.PomLabel(labels.get(key))));
}