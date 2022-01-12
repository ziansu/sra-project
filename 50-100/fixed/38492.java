public boolean exclude(java.lang.String filename, boolean isDirectory) {
    for (com.github.perlundq.yajsync.filelist.FilterRuleList.FilterRule rule : _rules) {
        if ((!isDirectory) && (rule.isDirectoryOnly()))
            continue;
        
        boolean matches = rule.matches(filename);
        if (matches) {
            if (rule.isInclusion()) {
                return false;
            }else {
                return true;
            }
        }
    }
    return false;
}