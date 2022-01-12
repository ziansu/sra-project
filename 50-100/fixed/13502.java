public void removeTableBlocks(java.util.List<java.lang.String> segmentToBeRemoved, org.carbondata.core.carbon.AbsoluteTableIdentifier absoluteTableIdentifier) {
    java.lang.Object lockObject = tableLockMap.get(absoluteTableIdentifier);
    if (null == lockObject) {
        return ;
    }
    synchronized(lockObject) {
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, org.carbondata.core.carbon.datastore.block.AbstractIndex>> map = tableSegmentMap.get(absoluteTableIdentifier);
        if (null == map) {
            return ;
        }
        for (java.lang.String segmentId : segmentToBeRemoved) {
            map.remove(segmentId);
        }
    }
}