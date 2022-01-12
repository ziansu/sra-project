@java.lang.Override
public boolean configure(org.kohsuke.stapler.StaplerRequest req, net.sf.json.JSONObject formData) throws com.amazonaws.codedeploy.FormException {
    awsAccessKey = formData.getString("awsAccessKey");
    awsSecretKey = formData.getString("awsSecretKey");
    proxyHost = formData.getString("proxyHost");
    proxyPort = java.lang.Integer.valueOf(formData.getString("proxyPort"));
    req.bindJSON(this, formData);
    save();
    return super.configure(req, formData);
}