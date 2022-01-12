public int getPartition(org.apache.hadoop.io.Text key, org.apache.hadoop.io.IntWritable value, int task_num) {
    java.lang.String term = key.toString();
    java.lang.String[] splitResults = term.split("#");
    int number = super.getPartition(new org.apache.hadoop.io.Text(splitResults[0]), value, task_num);
    return number;
}