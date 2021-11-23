@java.lang.Override
public hudson.plugins.git.browser.TFS2013GitRepositoryBrowser newInstance(org.kohsuke.stapler.StaplerRequest req, net.sf.json.JSONObject jsonObject) throws hudson.plugins.git.browser.FormException {
    try {
        req.getSubmittedForm();
    } catch (javax.servlet.ServletException e) {
        e.printStackTrace();
    }
    return req.bindJSON(hudson.plugins.git.browser.TFS2013GitRepositoryBrowser.class, jsonObject);
}