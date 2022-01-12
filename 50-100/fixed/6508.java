public static void main(java.lang.String[] args) {
    de.biomedical_imaging.ij.trajectory_classifier.help.PerformanceDataGenerator pg = new de.biomedical_imaging.ij.trajectory_classifier.help.PerformanceDataGenerator();
    try {
        de.biomedical_imaging.ij.trajectory_classifier.help.PerformanceDataGenerator.modelpath = pg.ExportResource("/randomForestModel.RData");
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    de.biomedical_imaging.ij.trajectory_classifier.help.PerformanceDataGenerator.generateActiveData();
    de.biomedical_imaging.ij.trajectory_classifier.help.PerformanceDataGenerator.generateConfinedData();
    de.biomedical_imaging.ij.trajectory_classifier.help.PerformanceDataGenerator.generateSubdiffusionData();
}