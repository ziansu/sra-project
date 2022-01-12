protected static java.lang.String removeNameOfDB(java.lang.String path) throws java.net.MalformedURLException, java.nio.file.InvalidPathException {
    if (((path.endsWith("\\DB")) || (path.endsWith("/DB"))) && (de.bund.bfr.knime.KnimeUtils.getFile((path + ".properties")).exists())) {
        return path.substring(0, ((path.length()) - 3));
    }
    return path;
}