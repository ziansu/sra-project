public int getPartition(org.apache.hadoop.io.Text key, CloudCompu.hw1.LongArrayWritable value, int numReduceTasks) {
    int c = key.charAt(0);
    int part = numReduceTasks / 2;
    if (c < 'a') {
        return part * ((c - 'A') / 26);
    }else {
        return (part * ((c - 'A') / 26)) + part;
    }
}