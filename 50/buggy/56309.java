public static void main(java.lang.String[] args) {
    task_11.process_files_in_threads.ReportFilesGenerator reportFilesGenerator = new task_11.process_files_in_threads.ReportFilesGenerator(ResourceHolder.NUM_OF_FILES);
    reportFilesGenerator.generateFiles();
    task_11.process_files_in_threads.ReportProcessor reportProcessor = new task_11.process_files_in_threads.ReportProcessor();
    reportProcessor.reportProcessing();
}