@java.lang.Override
public java.util.List<org.phenotips.configuration.RecordElement> getEnabledElements() {
    java.util.List<org.phenotips.configuration.RecordElement> result = new java.util.LinkedList<>();
    for (org.phenotips.configuration.RecordElement element : getAllElements()) {
        if (element.isEnabled()) {
            result.add(element);
        }
    }
    return java.util.Collections.unmodifiableList(result);
}