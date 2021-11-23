public com.github.cuter44.wxmp.util.TokenProvider getOrCreate(java.util.Properties p) throws java.lang.IllegalAccessException, java.lang.InstantiationException {
    java.lang.String appid = p.getProperty(com.github.cuter44.wxmp.util.ATMag.KEY_APPID);
    com.github.cuter44.wxmp.util.TokenProvider t = this.keeps.get(appid);
    if (t != null)
        return t;
    
    this.keep((t = this.instantiate(p)));
    return t;
}