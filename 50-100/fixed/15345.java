public static java.io.File joinFiles(javax.swing.JFrame parent, java.io.File[] inputFileArray, java.lang.Integer minNumberSamples) {
    java.io.File file = org.fhaes.tools.FHOperations.getOutputFile(parent, new org.fhaes.filefilter.FHXFileFilter(), false);
    if (file != null) {
        new org.fhaes.tools.FHOperations(parent, inputFileArray, file, 0, 0, 1.0, org.fhaes.enums.FireFilterType.NUMBER_OF_EVENTS, true, false, false, minNumberSamples, null, null);
        return file;
    }
    return null;
}