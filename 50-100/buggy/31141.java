@java.lang.Override
public void write(java.io.DataOutput out) throws java.io.IOException {
    org.apache.hadoop.io.Text txt = new org.apache.hadoop.io.Text();
    out.writeInt(properties.size());
    for (java.lang.Object key : properties.keySet()) {
        txt.set(((java.lang.String) (key)));
        txt.write(out);
        txt.set(properties.getProperty(((java.lang.String) (key))));
        txt.write(out);
    }
}