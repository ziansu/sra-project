@java.lang.SuppressWarnings(value = "unchecked")
public void reduce(MKOut key, java.lang.Iterable<MVOut> values, org.apache.hadoop.mapreduce.Reducer.Context context) throws java.io.IOException, java.lang.InterruptedException {
    java.lang.System.out.println(key);
    root = local.insert(root, ((MKOut) (((edu.purdue.cs.HSPGiST.WritablePoint) (key)).clone())), 1);
}