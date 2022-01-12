private synchronized void load() throws java.io.IOException {
    final hudson.XmlFile xml = getConfigFile();
    if ((xml != null) && (xml.exists())) {
        xml.unmarshal(this);
    }
}