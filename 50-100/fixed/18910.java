public io.fabric8.portswizzler.AllPortMappings getPortMappings() throws java.io.IOException {
    if ((portMappings) == null) {
        java.io.File file = getMappingFile();
        if ((file.exists()) && (file.isFile())) {
            portMappings = json.readerFor(io.fabric8.portswizzler.AllPortMappings.class).readValue(file);
            portMappings.updateAllocatedPorts();
        }
    }
    if ((portMappings) == null) {
        portMappings = new io.fabric8.portswizzler.AllPortMappings();
    }
    return portMappings;
}