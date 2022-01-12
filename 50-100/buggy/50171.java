public void move_unchecked(org.xtuml.bp.core.common.ModelRoot destination) {
    org.xtuml.bp.core.common.InstanceList sourceInstanceList = getInstanceList();
    synchronized(sourceInstanceList) {
        sourceInstanceList.remove(this);
    }
    org.xtuml.bp.core.common.InstanceList destinationInstanceList = destination.getInstanceList(getClass());
    synchronized(destinationInstanceList) {
        destinationInstanceList.remove(this);
    }
}