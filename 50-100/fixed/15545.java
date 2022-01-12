private static java.util.List<java.lang.Long> get_comments_down(java.lang.Long child_AID) {
    java.util.List<java.lang.Long> list = new java.util.LinkedList<java.lang.Long>();
    while (zxl.redis.Cluster.jc.exists(("get_commented:" + child_AID))) {
        child_AID = java.lang.Long.parseLong(zxl.redis.Cluster.jc.zrange(("get_commented:" + child_AID), 0, 0).iterator().next());
        if (child_AID != null)
            list.add(child_AID);
        
    } 
    return list;
}