@java.lang.Override
public hudson.tasks.Mailer.UserProperty newInstance(@javax.annotation.CheckForNull
org.kohsuke.stapler.StaplerRequest req, net.sf.json.JSONObject formData) throws hudson.tasks.FormException {
    return new hudson.tasks.Mailer.UserProperty((req != null ? req.getParameter("email.address") : null));
}