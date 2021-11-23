@java.lang.Override
public void map(org.apache.hadoop.io.LongWritable key, edu.umd.cloud9.collection.medline.MedlineCitation doc, edu.umd.cloud9.collection.medline.Context context) throws java.io.IOException, java.lang.InterruptedException {
    context.getCounter(edu.umd.cloud9.collection.medline.NumberMedlineCitations2.Count.DOCS).increment(1);
    edu.umd.cloud9.collection.medline.NumberMedlineCitations2.MyMapper.docid.set(java.lang.Integer.parseInt(doc.getDocid()));
    context.write(edu.umd.cloud9.collection.medline.NumberMedlineCitations2.MyMapper.docid, edu.umd.cloud9.collection.medline.NumberMedlineCitations2.MyMapper.one);
}