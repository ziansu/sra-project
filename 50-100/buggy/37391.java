@java.lang.Override
public java.lang.String toString() {
    java.lang.String msg = "";
    int i = 1;
    for (org.apache.hadoop.hbase.regionserver.SegmentScanner scanner : scanners) {
        msg += ((("scanner (" + i) + ") ") + (scanner.toString())) + " ||| ";
        i++;
    }
    return msg;
}