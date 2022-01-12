@java.lang.Override
public void reduce(org.apache.hadoop.io.Text cellId, java.util.Iterator<org.apache.hadoop.io.Text> values, final org.apache.hadoop.mapred.OutputCollector<org.apache.hadoop.io.Text, org.apache.hadoop.io.Text> output, org.apache.hadoop.mapred.Reporter reporter) throws java.io.IOException {
    edu.umn.cs.sthadoop.operations.STJoin.LOG.info("<Log>---->  I'm in reducer: ");
    java.lang.System.out.println("<println>-------> I'm in reducer: ");
    while (values.hasNext()) {
        output.collect(new org.apache.hadoop.io.Text(cellId.toString()), values.next());
        edu.umn.cs.sthadoop.operations.STJoin.LOG.info("<Log>---->  I'm in reducer: ");
        java.lang.System.out.println("<println>-------> I'm in reducer: ");
    } 
}