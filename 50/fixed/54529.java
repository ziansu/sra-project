@java.lang.Override
protected void setup(de.tudarmstadt.ukp.dkpro.c4corpus.hadoop.full.Context context) throws java.io.IOException, java.lang.InterruptedException {
    multipleOutputs = new org.apache.hadoop.mapreduce.lib.output.MultipleOutputs(context);
}