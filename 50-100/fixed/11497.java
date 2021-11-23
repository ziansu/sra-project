@java.lang.Override
public void reduce(org.apache.hadoop.io.Text key, java.lang.Iterable<org.apache.hadoop.io.BooleanWritable> values, com.capstone.maven.mostontimeairlines.Context context) {
    summaryMap.putIfAbsent(key.toString(), new com.capstone.maven.mostontimeairlines.OntimeSummaryWritable());
    com.capstone.maven.mostontimeairlines.OntimeSummaryWritable summary = summaryMap.get(key.toString());
    for (org.apache.hadoop.io.BooleanWritable val : values) {
        if (val.get()) {
            summary.incrementOntime();
        }else {
            summary.incrementNotOntime();
        }
    }
    summaryMap.put(key.toString(), summary);
}