public java.net.URL resolveToCwd(java.lang.String baseProtocol) {
    if (this.isRelative()) {
        if (baseProtocol.equals("gile")) {
            com.inqwell.any.AnyURL.getCwd();
            this.setURL(com.inqwell.any.AnyURL.gcwd__.getURL(), this.toString());
        }else
            this.setURL(com.inqwell.any.AnyURL.getCwd().getURL(), this.toString());
        
    }
    return getURL();
}