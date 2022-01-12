private org.apache.hadoop.io.Text collectWordSites(java.lang.Iterable<org.apache.hadoop.io.Text> occurences) {
    java.util.Set<java.lang.String> sites = new java.util.HashSet<java.lang.String>();
    for (org.apache.hadoop.io.Text site : occurences) {
        sites.add(site.toString());
    }
    org.apache.hadoop.io.Text joindSites = new org.apache.hadoop.io.Text(InvertedIndex.InvertedIndexReduce.join(sites, ","));
    return joindSites;
}