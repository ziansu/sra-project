@java.lang.Override
public io.jenkins.blueocean.rest.model.Container<io.jenkins.blueocean.service.embedded.rest.ChangeSetResource> getChangeSet() {
    java.util.Map<java.lang.String, io.jenkins.blueocean.service.embedded.rest.ChangeSetResource> m = new java.util.LinkedHashMap<>();
    int cnt = 0;
    for (hudson.scm.ChangeLogSet.Entry e : run.getChangeSet()) {
        cnt++;
        java.lang.String id = e.getCommitId();
        if (id == null)
            id = java.lang.String.valueOf(cnt);
        
        m.put(id, new io.jenkins.blueocean.service.embedded.rest.ChangeSetResource(e, this));
    }
    return io.jenkins.blueocean.rest.model.Containers.fromResourceMap(this.getLink(), m);
}