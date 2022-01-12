@java.lang.Override
public java.lang.String toString() {
    java.lang.StringBuffer buf = new java.lang.StringBuffer();
    int i = 1;
    try {
        for (org.apache.hadoop.hbase.regionserver.Segment segment : getListOfSegments()) {
            buf.append((((("Segment (" + i) + ") ") + (segment.toString())) + "; "));
            i++;
        }
    } catch (java.io.IOException e) {
        return e.toString();
    }
    return buf.toString();
}