@java.lang.Override
public void readFields(java.io.DataInput in) throws java.io.IOException {
    org.apache.hadoop.io.Text txt = new org.apache.hadoop.io.Text();
    int numEntries = in.readInt();
    while ((numEntries--) > 0) {
        txt.readFields(in);
        java.lang.String key = txt.toString();
        txt.readFields(in);
        java.lang.String value = txt.toString();
        this.properties.put(key, value);
    } 
}