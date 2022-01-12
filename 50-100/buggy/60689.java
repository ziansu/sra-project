public void saveRegistry() throws java.io.IOException {
    try (java.io.FileWriter fileWriter = new java.io.FileWriter(this.registryPath.toString())) {
        try (java.io.BufferedWriter writer = new java.io.BufferedWriter(fileWriter)) {
            for (java.lang.String pluginName : this.installedPlugins) {
                writer.write(pluginName);
            }
        }
    }
}