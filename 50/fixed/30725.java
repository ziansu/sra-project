@java.lang.Override
public long getClusterTime() {
    try {
        if ((hazelcastInstance) == null)
            return -1;
        
        return hazelcastInstance.getCluster().getClusterTime();
    } catch (com.orientechnologies.orient.server.hazelcast.HazelcastInstanceNotActiveException e) {
        return -1;
    }
}