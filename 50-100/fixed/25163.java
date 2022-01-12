private static boolean isBlacklisted(java.util.TreeSet<java.lang.String> tokenSet) {
    for (java.lang.String token : tokenSet) {
        br.com.allchemistry.spf.SPF.Distribution distribution = br.com.allchemistry.spf.SPF.CacheDistribution.get(token, false);
        if (distribution == null) {
        }else
            if (distribution.isBlacklisted()) {
                return true;
            }
        
    }
    return false;
}