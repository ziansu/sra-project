public static void main(java.lang.String[] args) {
    new ij.ImageJ();
    java.lang.String configFileName = "maars_config.xml";
    edu.univ_tlse3.maars.MaarsParameters parameters = GuiFreeRun.loadMaarsParameters(configFileName);
    if (!(java.lang.Boolean.parseBoolean(parameters.getSkipSegmentation()))) {
        GuiFreeRun.runSegmentation(parameters);
    }
    edu.univ_tlse3.gui.MaarsFluoAnalysisDialog fluoAnalysisDialog = new edu.univ_tlse3.gui.MaarsFluoAnalysisDialog(parameters);
    GuiFreeRun.executeAnalysis(fluoAnalysisDialog.getParameters());
}