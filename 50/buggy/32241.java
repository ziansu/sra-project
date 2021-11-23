@java.lang.Override
public io.jenkins.blueocean.rest.model.Resource resolve(hudson.model.Item context, io.jenkins.blueocean.rest.Reachable parent, hudson.model.Item target) {
    if ((context == target) && (target instanceof hudson.model.Job)) {
        return new io.jenkins.blueocean.service.embedded.PipelineApiTest.TestPipelineImpl(((hudson.model.Job) (target)));
    }
    return null;
}