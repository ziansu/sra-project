private boolean handleExistingErrors() {
    net.ocheyedan.ply.script.PropFile errorsProperties = net.ocheyedan.ply.script.PropFiles.load(errorsPropertiesFile.getPath(), false, false);
    if (errorsProperties.isEmpty()) {
        return false;
    }
    for (net.ocheyedan.ply.script.PropFile.Prop error : errorsProperties.props()) {
        net.ocheyedan.ply.Output.print(error.value());
    }
    return true;
}