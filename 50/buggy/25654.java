private static java.io.File getFile(java.lang.String classpathOrFilePath) {
    try {
        return new java.io.File(kr.jm.utils.helper.JMResources.getResourceURI(classpathOrFilePath));
    } catch (java.lang.Exception e) {
        return new java.io.File(classpathOrFilePath);
    }
}