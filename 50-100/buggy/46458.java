private java.io.File getSourceBundleFileFromArgs(java.lang.String... expectedExtensions) {
    java.lang.String path = findValueAfterFlag(org.interfaceit.ui.commandline.ArgumentParser.Flag.SOURCE_PATH, null);
    java.io.File file = null;
    if (null != path) {
        if (((expectedExtensions.length) < 1) || (endsWithOneOf(path, expectedExtensions))) {
            file = new java.io.File(path);
        }
    }
    return file;
}