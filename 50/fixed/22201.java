@java.lang.Override
public io.fabric8.kubernetes.api.model.Volume create(java.lang.String name, int serverId) {
    return new io.fabric8.kubernetes.api.model.VolumeBuilder().withName(name).withNewFlocker(name, (((io.fabric8.zookeeper.VolumeProvider.FLOCKER_PREFIX) + "-") + serverId)).build();
}