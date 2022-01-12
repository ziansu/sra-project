public int compare(org.apache.hadoop.io.WritableComparable w1, org.apache.hadoop.io.WritableComparable w2) {
    org.apache.hadoop.io.Text t1 = ((org.apache.hadoop.io.Text) (w1));
    org.apache.hadoop.io.Text t2 = ((org.apache.hadoop.io.Text) (w2));
    return t1.toString().split("_")[0].compareTo(t2.toString().split(" ")[0]);
}