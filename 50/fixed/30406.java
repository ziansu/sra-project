@org.kohsuke.stapler.export.Exported
public java.lang.String getUserName() {
    if ((authenticationName) == null)
        return "N/A";
    
    hudson.model.User u = hudson.model.User.get(authenticationName, false, null);
    return u != null ? u.getDisplayName() : authenticationName;
}