@java.lang.Override
public void map(org.apache.hadoop.io.IntWritable docId, org.apache.mahout.math.VectorWritable document, org.apache.mahout.clustering.lda.cvb.Context context) throws java.io.IOException, java.lang.InterruptedException {
    org.apache.mahout.math.Vector topicVector = new org.apache.mahout.math.DenseVector(new double[numTopics]).assign((1.0 / (numTopics)));
    modelTrainer.train(document.get(), topicVector, true, maxIters);
}