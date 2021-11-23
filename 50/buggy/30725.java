@java.lang.Override
public long getClusterTime() {
    try {
        return hazelcastInstance.getCluster().getClusterTime();
    } catch (com.orientechnologies.orient.server.hazelcast.HazelcastInstanceNotActiveException e) {
        return -1;
    }
}