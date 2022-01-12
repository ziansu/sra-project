public static bioLockJ.util.BioLockJProperties readProps(final java.lang.String filePath, final bioLockJ.util.BioLockJProperties defaultProps) throws java.lang.Exception {
    final java.io.File inFile = new java.io.File(filePath);
    if (inFile.exists()) {
        final java.io.InputStream in = new java.io.FileInputStream(filePath);
        final bioLockJ.util.BioLockJProperties tempProps = (defaultProps == null) ? new bioLockJ.util.BioLockJProperties() : new bioLockJ.util.BioLockJProperties(defaultProps);
        tempProps.load(in);
        in.close();
        return tempProps;
    }
    return null;
}