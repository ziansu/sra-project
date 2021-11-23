private org.apache.hadoop.io.Text collectWordSites(java.lang.Iterable<org.apache.hadoop.io.Text> occurences) {
    java.util.Set<org.apache.hadoop.io.Text> sites = new java.util.HashSet<org.apache.hadoop.io.Text>();
    for (org.apache.hadoop.io.Text site : occurences) {
        sites.add(site);
    }
    org.apache.hadoop.io.Text joindSites = new org.apache.hadoop.io.Text(InvertedIndex.InvertedIndexReduce.join(sites, ","));
    return joindSites;
}