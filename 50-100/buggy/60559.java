@java.lang.Override
protected boolean isWithin(org.apache.lucene.search.Range o) {
    org.apache.lucene.search.TestInetAddressRangeQueries.IpRange other = ((org.apache.lucene.search.TestInetAddressRangeQueries.IpRange) (o));
    byte[] bMin = min.getAddress();
    byte[] bMax = max.getAddress();
    return ((org.apache.lucene.util.StringHelper.compare(bMin.length, bMin, 0, other.min.getAddress(), 0)) >= 0) && ((org.apache.lucene.util.StringHelper.compare(bMax.length, bMax, 0, other.max.getAddress(), 0)) <= 0);
}