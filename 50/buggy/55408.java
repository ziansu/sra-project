public net.lldp.checksims.ChecksimsConfig setArchiveSubmissions(java.util.Set<net.lldp.checksims.submission.Submission> newArchiveSubmissions) {
    com.google.common.base.Preconditions.checkNotNull(newArchiveSubmissions);
    this.archiveSubmissions = com.google.common.collect.ImmutableSet.copyOf(archiveSubmissions);
    return this;
}