public java.security.KeyStore getKeyStore() {
    org.apache.ofbiz.base.component.ComponentResourceHandler rh = this.createResourceHandler();
    if (rh != null) {
        try {
            return org.apache.ofbiz.base.util.KeyStoreUtil.getStore(rh.getURL(), this.getPassword(), this.getType());
        } catch (java.lang.Exception e) {
            org.apache.ofbiz.base.util.Debug.logWarning(e, org.apache.ofbiz.base.component.ComponentConfig.module);
        }
    }
    return null;
}