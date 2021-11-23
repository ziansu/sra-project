public boolean equals(java.lang.Object obj) {
    if (!(obj instanceof org.eclipse.ecf.core.util.ProxyAddress))
        return false;
    
    org.eclipse.ecf.core.util.ProxyAddress other = ((org.eclipse.ecf.core.util.ProxyAddress) (obj));
    return (this.hostname.equals(other.hostname)) && ((this.port) == (other.port));
}