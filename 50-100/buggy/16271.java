public static org.apache.hadoop.fs.Path getDefaultWorkFileOverride(com.twitter.elephantbird.mapreduce.output.WorkFileOverride workFileOverride, org.apache.hadoop.mapreduce.lib.output.FileOutputFormat<?, ?> outputFormat, org.apache.hadoop.mapreduce.TaskAttemptContext context, java.lang.String extension) throws java.io.IOException {
    java.lang.String name = workFileOverride.getName();
    if (name == null) {
        return outputFormat.getDefaultWorkFile(context, extension);
    }else {
        org.apache.hadoop.mapreduce.lib.output.FileOutputCommitter committer = ((org.apache.hadoop.mapreduce.lib.output.FileOutputCommitter) (outputFormat.getOutputCommitter(context)));
        return new org.apache.hadoop.fs.Path(committer.getWorkPath(), (name + extension));
    }
}