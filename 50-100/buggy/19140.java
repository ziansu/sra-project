@java.lang.Override
public boolean configure(org.kohsuke.stapler.StaplerRequest req, net.sf.json.JSONObject json) throws org.jenkinsci.plugins.systemmessage.FormException {
    boolean b = super.configure(req, json);
    org.jenkinsci.plugins.systemmessage.model.MessageTextStrategy mtsBeforeImage = this.messageTextStrategy;
    req.bindJSON(this, json);
    if (!(mtsBeforeImage.equals(this.messageTextStrategy))) {
        this.messageTextStrategy.updateOnConfigurationChange(mtsBeforeImage);
    }
    this.save();
    org.jenkinsci.plugins.systemmessage.SystemMessagePanelManager.getInstance().reloadAll();
    return b;
}