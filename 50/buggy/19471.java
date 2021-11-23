public java.lang.String getUrl() {
    java.lang.String args = this.getQuery();
    if (org.cny.awf.util.Util.isNoEmpty(args)) {
        return ((this.url) + "?") + args;
    }else {
        return this.url;
    }
}