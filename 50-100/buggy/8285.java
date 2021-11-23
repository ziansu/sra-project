@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    final org.datacleaner.configuration.DataCleanerConfigurationImpl configuration = new org.datacleaner.configuration.DataCleanerConfigurationImpl(_configuration).withEnvironment(new org.datacleaner.configuration.DataCleanerEnvironmentImpl(_configuration.getEnvironment()).withTaskRunner(new org.datacleaner.job.concurrent.SingleThreadedTaskRunner()));
    final org.datacleaner.job.AnalysisJob jobCopy = _analysisJobBuilder.toAnalysisJob(false);
    final org.datacleaner.job.builder.AnalysisJobBuilder jobBuilderCopy = new org.datacleaner.job.builder.AnalysisJobBuilder(configuration, jobCopy);
    final org.datacleaner.actions.RunAnalysisActionListener runAnalysis = new org.datacleaner.actions.RunAnalysisActionListener(_dcModule, jobBuilderCopy);
    runAnalysis.run();
}