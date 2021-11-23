private java.util.List<org.apache.zookeeper.data.ACL> removeDuplicates(java.util.List<org.apache.zookeeper.data.ACL> acl) {
    java.util.ArrayList<org.apache.zookeeper.data.ACL> retval = new java.util.ArrayList<org.apache.zookeeper.data.ACL>();
    java.util.Iterator<org.apache.zookeeper.data.ACL> it = acl.iterator();
    while (it.hasNext()) {
        org.apache.zookeeper.data.ACL a = it.next();
        if ((retval.contains(a)) == false) {
            retval.add(a);
        }
    } 
    return retval;
}