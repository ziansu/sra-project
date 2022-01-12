@java.lang.Override
public org.acegisecurity.Authentication authenticate(hudson.model.Job<?, ?> project, hudson.model.Queue.Item item) {
    hudson.model.User u = hudson.model.User.get(getUserid(), false, java.util.Collections.emptyMap());
    if (u == null) {
        return jenkins.model.Jenkins.ANONYMOUS;
    }
    org.acegisecurity.Authentication a = u.impersonate();
    if (a == null) {
        return jenkins.model.Jenkins.ANONYMOUS;
    }
    return a;
}