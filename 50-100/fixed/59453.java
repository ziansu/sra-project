@java.lang.Override
@java.lang.Deprecated
public void cleanupJob(org.apache.hadoop.mapreduce.lib.output.JobContext context) throws java.io.IOException {
    if (hasOutputPath()) {
        org.apache.hadoop.fs.Path pendingJobAttemptsPath = getPendingJobAttemptsPath();
        org.apache.hadoop.fs.FileSystem fs = pendingJobAttemptsPath.getFileSystem(context.getConfiguration());
        cleanOSSUploadResidue(pendingJobAttemptsPath, fs);
        fs.delete(pendingJobAttemptsPath, true);
    }else {
        org.apache.hadoop.mapreduce.lib.output.FileOutputCommitter.LOG.warn("Output Path is null in cleanupJob()");
    }
}