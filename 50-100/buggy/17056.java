public java.lang.String getApiKey() {
    if ((getCredentials()) != null) {
        return getCredentials().getApiKey();
    }else {
        hudson.plugins.sauce_ondemand.PluginImpl p = hudson.plugins.sauce_ondemand.PluginImpl.get();
        if (p.isReuseSauceAuth()) {
            com.saucelabs.common.SauceOnDemandAuthentication storedCredentials;
            storedCredentials = new com.saucelabs.common.SauceOnDemandAuthentication();
            return storedCredentials.getAccessKey();
        }else {
            return hudson.util.Secret.toString(p.getApiKey());
        }
    }
}