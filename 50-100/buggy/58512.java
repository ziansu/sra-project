@java.lang.SuppressWarnings(value = "unchecked")
public java.util.ArrayList<eu.fp7.scase.inputParser.YamlResource> parseYamlInputFile() {
    this.listOfYamlResources = oYamlHandler.loadAs(oInputStreamHandler, java.util.ArrayList.class);
    try {
        oInputStreamHandler.close();
    } catch (java.io.IOException e) {
        eu.fp7.scase.launcher.cimgenerator.Activator.log("Unable to open input stream to read the input YAML file", e);
    }
    return this.listOfYamlResources;
}