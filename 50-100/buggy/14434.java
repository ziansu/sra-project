private java.util.List<java.lang.String> parseConfigurationFile() {
    java.util.List<java.lang.String> configuration = readFileToLines("annotation.conf");
    java.util.List<java.lang.String> entityLabels = new java.util.ArrayList<>();
    for (java.lang.String line : configuration) {
        if ((line.equals("[entities]")) || (line.equals(""))) {
            continue;
        }else
            if (line.equals("[relations]")) {
                break;
            }else {
                entityLabels.add(line);
            }
        
    }
    return entityLabels;
}