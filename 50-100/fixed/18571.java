public static java.io.File createEventFile(javax.swing.JFrame parent, java.io.File[] inputFileArray, java.lang.Integer startYear, java.lang.Integer endYear, org.fhaes.enums.FireFilterType fireFilterType, java.lang.Double fireFilterValue, java.lang.Integer minNumberSamples, java.lang.String comments) {
    java.io.File file = org.fhaes.tools.FHOperations.getOutputFile(parent, new org.fhaes.filefilter.TXTFileFilter(), true);
    if (file != null) {
        new org.fhaes.tools.FHOperations(parent, inputFileArray, file, startYear, endYear, fireFilterValue, fireFilterType, false, false, true, minNumberSamples, null, comments);
        return file;
    }
    return null;
}