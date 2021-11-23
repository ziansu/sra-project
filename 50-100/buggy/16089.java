@java.lang.Override
public int compare(org.apache.hadoop.io.WritableComparable value1, org.apache.hadoop.io.WritableComparable value2) {
    SEO.TextPair tp1 = ((SEO.TextPair) (value1));
    SEO.TextPair tp2 = ((SEO.TextPair) (value2));
    return tp1.getFirst().compareTo(tp2.getFirst());
}