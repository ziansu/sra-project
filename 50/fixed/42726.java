public int hashCode() {
    if ((this.hostname) == null)
        return super.hashCode();
    
    return (this.hostname.hashCode()) ^ (java.lang.Math.abs(this.port));
}