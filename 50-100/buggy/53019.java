private static void removePeerObject(org.robovm.objc.ObjCObject o) {
    synchronized(org.robovm.objc.ObjCObject.objcBridgeLock) {
        org.robovm.objc.ObjCObject.ObjCObjectRef ref = org.robovm.objc.ObjCObject.peers.remove(o.getHandle());
        org.robovm.objc.ObjCObject p = (ref != null) ? ref.get() : null;
        if ((p != null) && (o != p)) {
            org.robovm.objc.ObjCObject.peers.put(o.getHandle(), new org.robovm.objc.ObjCObject.ObjCObjectRef(o));
        }
    }
}