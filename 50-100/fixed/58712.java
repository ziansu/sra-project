public static java.io.File createEventFile(javax.swing.JFrame parent, java.io.File[] inputFileArray, java.lang.Integer minNumberSamples) {
    java.io.File file = org.fhaes.tools.FHOperations.getOutputFile(parent, new org.fhaes.filefilter.TXTFileFilter(), true);
    if (file != null) {
        new org.fhaes.tools.FHOperations(parent, inputFileArray, file, 0, 0, 1.0, org.fhaes.enums.FireFilterType.NUMBER_OF_EVENTS, false, false, true, minNumberSamples, null, null);
        return file;
    }
    return null;
}