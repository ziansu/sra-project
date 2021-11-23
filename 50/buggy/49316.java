@java.lang.Override
public boolean configure(org.kohsuke.stapler.StaplerRequest req, net.sf.json.JSONObject formData) throws org.ijsberg.ijsbergplugin.FormException {
    alterantiveUploadDirectory = formData.getString("alternativeUploadDirectory");
    save();
    return super.configure(req, formData);
}