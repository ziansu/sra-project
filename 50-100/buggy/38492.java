public boolean exclude(java.lang.String filename, boolean isDirectory) {
    boolean isIncludedMinOnce = false;
    for (com.github.perlundq.yajsync.filelist.FilterRuleList.FilterRule rule : _rules) {
        if ((!isDirectory) && (rule.isDirectoryOnly()))
            continue;
        
        boolean matches = rule.matches(filename);
        if (matches) {
            if (rule.isInclusion()) {
                isIncludedMinOnce = true;
            }else {
                return true;
            }
        }
    }
    return !isIncludedMinOnce;
}