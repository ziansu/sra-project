public java.lang.String getApiKey() {
    if ((getCredentials()) != null) {
        return getCredentials().getApiKey();
    }else {
        hudson.plugins.sauce_ondemand.PluginImpl p = hudson.plugins.sauce_ondemand.PluginImpl.get();
        return hudson.util.Secret.toString(p.getApiKey());
    }
}