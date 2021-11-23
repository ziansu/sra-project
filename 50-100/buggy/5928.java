public static java.lang.String load(java.lang.String path, java.lang.String charsetName, int readTimeout) throws java.io.IOException {
    java.net.URL url = org.cubeengine.pericopist.util.Misc.getResource(path);
    if (url == null) {
        throw new java.io.FileNotFoundException((("The resource '" + path) + "' was not found in file system or as URL."));
    }
    return org.cubeengine.pericopist.util.Misc.getContent(url, java.nio.charset.Charset.forName(charsetName), 5000).getValue();
}