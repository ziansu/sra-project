public boolean isMatch(java.lang.String value, com.alibaba.dubbo.common.URL param) {
    for (java.lang.String mismatch : mismatches) {
        if (com.alibaba.dubbo.common.utils.UrlUtils.isMatchGlobPattern(mismatch, value, param)) {
            return false;
        }
    }
    for (java.lang.String match : matches) {
        if (com.alibaba.dubbo.common.utils.UrlUtils.isMatchGlobPattern(match, value, param)) {
            return true;
        }
    }
    return matches.isEmpty();
}