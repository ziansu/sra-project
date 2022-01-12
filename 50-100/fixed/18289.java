private java.util.List<org.apache.zookeeper.data.ACL> removeDuplicates(java.util.List<org.apache.zookeeper.data.ACL> acl) {
    java.util.LinkedList<org.apache.zookeeper.data.ACL> retval = new java.util.LinkedList<org.apache.zookeeper.data.ACL>();
    for (org.apache.zookeeper.data.ACL a : acl) {
        if (!(retval.contains(a))) {
            retval.add(a);
        }
    }
    return retval;
}