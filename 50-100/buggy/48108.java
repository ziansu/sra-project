protected void initWatch(java.lang.String path) {
    org.dsa.iot.historian.database.Watch watch;
    {
        org.dsa.iot.dslink.node.NodeBuilder b = node.createChild(path);
        b.setValueType(ValueType.DYNAMIC);
        b.setValue(null);
        org.dsa.iot.dslink.node.Node n = b.build();
        watch = new org.dsa.iot.historian.database.Watch(this, n);
        watch.init(permission);
        n.setMetaData(watch);
        db.getProvider().onWatchAdded(watch);
    }
    scheduleWriteToBuffer();
}