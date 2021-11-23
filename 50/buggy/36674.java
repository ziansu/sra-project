public static gitp4.p4.P4FileStatInfo batchGetFileStats(java.lang.Iterable<? extends java.lang.CharSequence> files) throws java.lang.Exception {
    return gitp4.p4.cmd.P4XTemplate.run(gitp4.p4.cmd.P4Fstat.FSTAT_CMD, files, P4FileStatInfo::create);
}