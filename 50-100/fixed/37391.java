@java.lang.Override
public java.lang.String toString() {
    java.lang.StringBuffer buf = new java.lang.StringBuffer();
    int i = 1;
    for (org.apache.hadoop.hbase.regionserver.SegmentScanner scanner : scanners) {
        buf.append((((("scanner (" + i) + ") ") + (scanner.toString())) + " ||| "));
        i++;
    }
    return buf.toString();
}