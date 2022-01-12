public static void computeStats() {
    final java.lang.String INPUT_DIR = "D:\\TEST";
    final java.lang.String OUTPUT_FILE = "D:\\output\\stats.txt";
    sk.styk.martin.bakalarka.files.FileFinder ff = new sk.styk.martin.bakalarka.files.FileFinder(new java.io.File(INPUT_DIR));
    java.util.List<java.io.File> jsons = ff.getJsonFilesInDirectories();
    sk.styk.martin.bakalarka.statistics.processors.StatisticsProcessor statisticsProcessor = new sk.styk.martin.bakalarka.statistics.processors.StatisticsProcessor(jsons);
    statisticsProcessor.setOutputFile(new java.io.File(OUTPUT_DIR));
    sk.styk.martin.bakalarka.statistics.data.OverallStatistics overallStatistics = statisticsProcessor.processFiles();
}