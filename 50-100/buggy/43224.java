public void terminateUnregisteredInstances(cd.go.contrib.elasticagents.docker.PluginSettings settings, cd.go.contrib.elasticagents.Agents agents) throws java.lang.Exception {
    cd.go.contrib.elasticagents.docker.DockerContainers toTerminate = unregisteredAfterTimeout(settings, agents);
    if (toTerminate.isEmpty()) {
        return ;
    }
    cd.go.contrib.elasticagents.docker.DockerPlugin.LOG.warn((("Terminating instances that did not register " + (toTerminate.keySet())) + "."));
    for (cd.go.contrib.elasticagents.docker.DockerContainer container : toTerminate.values()) {
        terminate(container.id(), settings);
    }
}