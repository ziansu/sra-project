public java.lang.String getHostname() {
    if ((this.hostname) != null)
        return hostname;
    else {
        try {
            if (org.apache.catalina.tribes.membership.MemberImpl.DO_DNS_LOOKUPS)
                this.hostname = java.net.InetAddress.getByAddress(host).getHostName();
            else
                this.hostname = org.apache.catalina.tribes.util.Arrays.toString(host, 0, host.length, true);
            
            return this.hostname;
        } catch (java.io.IOException x) {
            throw new java.lang.RuntimeException(org.apache.catalina.tribes.membership.MemberImpl.sm.getString("memberImpl.unableParse.hostname"), x);
        }
    }
}