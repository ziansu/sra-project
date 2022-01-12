protected void initializeClientConfiguration() {
    if (((this.casPrefixUrl) != null) && (!(this.casPrefixUrl.endsWith("/")))) {
        this.casPrefixUrl += "/";
    }
    if (org.pac4j.core.util.CommonHelper.isBlank(this.casPrefixUrl)) {
        this.casPrefixUrl = this.casLoginUrl.replaceFirst("/login$", "/$");
    }else
        if (org.pac4j.core.util.CommonHelper.isBlank(this.casLoginUrl)) {
            this.casLoginUrl = (this.casPrefixUrl) + "login";
        }
    
}