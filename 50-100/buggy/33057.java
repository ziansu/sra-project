private java.io.File checkNodejsFile(java.io.File nodejsFile) throws ts.TypeScriptException {
    if (nodejsFile == null) {
        throw new ts.TypeScriptException("node file cannot be null");
    }
    if (!(nodejsFile.exists())) {
        throw new ts.TypeScriptException(("Cannot find node file " + (ts.utils.FileUtils.getPath(nodejsFile))));
    }
    return nodejsFile;
}