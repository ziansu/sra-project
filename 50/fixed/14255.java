private static java.lang.String getCorrespondenceFileName() {
    java.lang.String fileExtSeparator = tools.vitruv.framework.util.VitruviusConstants.getFileExtSeparator();
    java.lang.String fileExt = tools.vitruv.framework.util.VitruviusConstants.getCorrespondencesFileExt();
    return ("Correspondences" + fileExtSeparator) + fileExt;
}