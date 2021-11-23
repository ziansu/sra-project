@java.lang.Override
public void configure(org.kohsuke.stapler.StaplerRequest req, net.sf.json.JSONObject formData) throws Descriptor.FormException, java.io.IOException, javax.servlet.ServletException {
    reuseSauceAuth = formData.getBoolean("reuseSauceAuth");
    disableStatusColumn = formData.getBoolean("disableStatusColumn");
    username = formData.getString("username");
    apiKey = hudson.util.Secret.fromString(formData.getString("apiKey"));
    sauceConnectDirectory = formData.getString("sauceConnectDirectory");
    sauceConnectOptions = formData.getString("sauceConnectOptions");
    environmentVariablePrefix = formData.getString("environmentVariablePrefix");
    save();
}