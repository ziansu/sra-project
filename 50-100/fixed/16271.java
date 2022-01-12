public static org.apache.hadoop.fs.Path getDefaultWorkFileOverride(org.apache.hadoop.mapreduce.lib.output.FileOutputFormat<?, ?> outputFormat, java.lang.String name, org.apache.hadoop.mapreduce.TaskAttemptContext context, java.lang.String extension) throws java.io.IOException {
    org.apache.hadoop.mapreduce.lib.output.FileOutputCommitter committer = ((org.apache.hadoop.mapreduce.lib.output.FileOutputCommitter) (outputFormat.getOutputCommitter(context)));
    return new org.apache.hadoop.fs.Path(committer.getWorkPath(), (name + extension));
}