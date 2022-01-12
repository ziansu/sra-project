@javax.ws.rs.GET
@com.yammer.metrics.annotation.Timed
public java.net.URI[] getJobs() {
    java.util.List<java.net.URI> uris = new java.util.ArrayList(xenonmanager.getJobs().size());
    javax.ws.rs.core.UriBuilder builder = uriInfo.getAbsolutePathBuilder().path("{jobidentifier}");
    for (nl.esciencecenter.osmium.api.SandboxedJob job : xenonmanager.getJobs()) {
        uris.add(builder.build(job.getIdentifier()));
    }
    return uris.toArray(new java.net.URI[uris.size()]);
}