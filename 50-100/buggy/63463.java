@java.lang.Override
public void terminate(java.lang.String agentId, cd.go.contrib.elasticagents.docker.PluginSettings settings) throws java.lang.Exception {
    cd.go.contrib.elasticagents.docker.DockerContainer instance = instances.get(agentId);
    if (instance != null) {
        instance.terminate(docker(settings));
    }else {
        cd.go.contrib.elasticagents.docker.DockerPlugin.LOG.warn(("Requested to terminate an instance that does not exist " + agentId));
    }
    doWithLockOnSemaphore(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            semaphore.release();
        }
    });
    instances.remove(agentId);
}