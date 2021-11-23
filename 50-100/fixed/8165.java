public void reduce(org.apache.hadoop.io.Text inputKey, java.util.Iterator<org.apache.hadoop.io.Text> inputVals, org.apache.hadoop.mapred.OutputCollector<org.apache.hadoop.io.Text, slmt.courses.cp.hw3.step1.PageInfo> outputCollector, org.apache.hadoop.mapred.Reporter reporter) throws java.io.IOException {
    slmt.courses.cp.hw3.step1.PageInfo info = new slmt.courses.cp.hw3.step1.PageInfo();
    info.setRank((1 / ((double) (nodeCount))));
    while (inputVals.hasNext())
        info.addOutLink(inputVals.next().toString());
    
    outputCollector.collect(inputKey, info);
}