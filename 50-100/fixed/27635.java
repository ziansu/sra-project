public void execute() throws io.subutai.common.peer.PeerException, io.subutai.core.environment.api.exception.EnvironmentManagerException {
    java.util.Set<io.subutai.common.peer.Host> hosts = com.google.common.collect.Sets.newHashSet();
    hosts.addAll(environment.getContainerHosts());
    java.util.Set<java.lang.String> userKeys = environment.getSshKeys();
    exchangeSshKeys(userKeys);
}