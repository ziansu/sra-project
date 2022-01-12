private static boolean isBlacklisted(java.util.TreeSet<java.lang.String> tokenSet) {
    boolean blacklisted = false;
    for (java.lang.String token : tokenSet) {
        br.com.allchemistry.spf.SPF.Distribution distribution = br.com.allchemistry.spf.SPF.CacheDistribution.get(token, false);
        if (distribution == null) {
        }else
            if (distribution.isBlacklisted(true)) {
                blacklisted = true;
            }
        
    }
    return blacklisted;
}