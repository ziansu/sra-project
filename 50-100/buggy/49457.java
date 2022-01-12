private static void setTimeAndCoverage(edu.washington.cs.dt.impact.data.ProjectEnhancedResults currProj, int figNum, java.lang.String timeInFile, java.lang.String coverageInFile, int indexOfProj) {
    if ((timeInFile != null) && (coverageInFile != null)) {
        currProj.setCoverageInfo(figNum, indexOfProj, edu.washington.cs.dt.impact.Main.EnhancedResultsFigureGenerator.strArrayToDoubleArray(edu.washington.cs.dt.impact.Main.EnhancedResultsFigureGenerator.getRidSquareBrackets(coverageInFile)));
        currProj.setTimeInfo(figNum, indexOfProj, edu.washington.cs.dt.impact.Main.EnhancedResultsFigureGenerator.strArrayToDoubleArray(edu.washington.cs.dt.impact.Main.EnhancedResultsFigureGenerator.getRidSquareBrackets(timeInFile)));
    }
}