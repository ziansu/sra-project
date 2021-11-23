public int getPartition(org.apache.hadoop.io.Text key, org.apache.hadoop.io.IntWritable value, int task_num) {
    java.lang.String term = key.toString();
    java.lang.String[] splitResults = term.split("#");
    if ((term.split("#").length) == 1)
        return 0;
    
    int number = (java.lang.Integer.parseInt(splitResults[0])) / task_num;
    return number;
}