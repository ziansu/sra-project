protected java.lang.String getVersionNumberFromJava() {
    java.lang.String data = net.technicpack.utilslib.Utils.getProcessOutput(javaPath.getAbsolutePath(), "-version");
    if (data == null)
        return null;
    
    is64Bit = data.contains("64-Bit");
    int versionStartIndex = data.indexOf("java version \"");
    if (versionStartIndex < 0)
        return null;
    
    versionStartIndex += "java version \"".length();
    int versionEndIndex = data.indexOf('\"', versionStartIndex);
    return data.substring(versionStartIndex, versionEndIndex);
}