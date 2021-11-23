public static java.lang.String readString(java.lang.String classpathOrFilePath, java.lang.String encoding) {
    return kr.jm.utils.helper.JMFileIO.readString(kr.jm.utils.helper.JMFileIO.getFile(classpathOrFilePath), encoding);
}