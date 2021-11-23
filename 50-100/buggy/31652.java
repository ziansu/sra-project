private static boolean removePattern(org.w3c.dom.Element patternElement, java.lang.String buildConfigName) {
    if (patternElement != null) {
        java.lang.String oldPattern = patternElement.getTextContent();
        java.lang.String newPattern = io.fabric8.jenkins.openshiftsync.JenkinsUtils.removePattern(oldPattern, buildConfigName);
        if (!(java.util.Objects.equals(oldPattern, newPattern))) {
            io.fabric8.jenkins.openshiftsync.XmlUtils.setElementText(patternElement, newPattern);
            return true;
        }
    }
    return false;
}