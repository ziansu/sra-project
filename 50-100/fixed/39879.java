@java.lang.Override
protected boolean isDisjoint(org.apache.lucene.search.Range o) {
    org.apache.lucene.search.TestInetAddressRangeQueries.IpRange other = ((org.apache.lucene.search.TestInetAddressRangeQueries.IpRange) (o));
    return ((org.apache.lucene.util.StringHelper.compare(min.length, min, 0, other.max, 0)) > 0) || ((org.apache.lucene.util.StringHelper.compare(max.length, max, 0, other.min, 0)) < 0);
}