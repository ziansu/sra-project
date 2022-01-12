@java.lang.Override
public void write(java.io.DataOutput out) throws java.io.IOException {
    org.apache.hadoop.io.Text txt = new org.apache.hadoop.io.Text();
    out.writeInt(this.properties.size());
    for (java.lang.Object key : this.properties.keySet()) {
        txt.set(((java.lang.String) (key)));
        txt.write(out);
        txt.set(this.properties.getProperty(((java.lang.String) (key))));
        txt.write(out);
    }
}