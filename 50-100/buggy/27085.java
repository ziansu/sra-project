private static void runJobLocally(org.apache.hadoop.mapreduce.Job job, org.apache.commons.cli.CommandLine cmdline, com.marklogic.contentpump.Command cmd) throws java.lang.Exception {
    com.marklogic.contentpump.LocalJobRunner runner = new com.marklogic.contentpump.LocalJobRunner(job, cmdline, cmd);
    runner.run();
    com.marklogic.contentpump.utilities.AuditUtil.auditMlcpFinish(job.getConfiguration(), job.getJobName(), runner.getReporter().counters);
}