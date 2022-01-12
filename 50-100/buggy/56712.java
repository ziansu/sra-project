@java.lang.Override
public java.lang.String toString() {
    java.lang.String res = "";
    int i = 1;
    try {
        for (org.apache.hadoop.hbase.regionserver.Segment segment : getListOfSegments()) {
            res += ((("Segment (" + i) + ") ") + (segment.toString())) + "; ";
            i++;
        }
    } catch (java.io.IOException e) {
        return e.toString();
    }
    return res;
}