public static java.lang.String isHost(java.lang.String host) {
    if (host == null) {
        return null;
    }
    if ((host.length()) > 255) {
        return HariSekhon.Utils.isIP(host);
    }else
        if (host.matches((("^" + (HariSekhon.Utils.host_regex)) + "$"))) {
            return host;
        }else
            if ((HariSekhon.Utils.isIP(host)) != null) {
                return host;
            }else {
                return null;
            }
        
    
}