public com.github.cuter44.wxmp.util.CertificateLoader config(java.util.Properties conf) {
    java.lang.String confLoadTrusts = conf.getProperty(com.github.cuter44.wxmp.util.CertificateLoader.KEY_LOAD_TRUSTS);
    if (confLoadTrusts != null)
        this.loadTrusts(confLoadTrusts.split("\\:|;"));
    
    java.lang.String confLoadIdentification = conf.getProperty(com.github.cuter44.wxmp.util.CertificateLoader.KEY_LOAD_IDENTIFICATION);
    if (confLoadIdentification != null) {
        java.lang.String mchId = conf.getProperty(com.github.cuter44.wxmp.util.CertificateLoader.KEY_MCH_ID);
        this.loadIdentification(confLoadIdentification, mchId);
    }
    return this;
}