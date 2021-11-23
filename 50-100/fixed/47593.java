public static boolean hasUnSupportedDnsDomain(java.lang.String hostname, java.lang.String nodelabel, java.lang.String[] sub_domains) {
    if (hostname == null)
        return true;
    
    if (hostname.contains(".")) {
        java.lang.String hostlabel = hostname.substring(0, hostname.indexOf("."));
        for (java.lang.String subdomain : sub_domains) {
            if (nodelabel.equals(((hostlabel + ".") + subdomain))) {
                return false;
            }
        }
    }else {
        return false;
    }
    return true;
}