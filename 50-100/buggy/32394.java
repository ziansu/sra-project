public static void joinFiles(javax.swing.JFrame parent, java.io.File[] inputFileArray, java.io.File outputFile, java.lang.Integer startYear, java.lang.Integer endYear, java.lang.Integer minNumberSamples) {
    new org.fhaes.tools.FHOperations(parent, inputFileArray, outputFile, startYear, endYear, 1.0, org.fhaes.enums.FireFilterType.NUMBER_OF_EVENTS, true, false, false, minNumberSamples, null);
}