private static void removePeerObject(org.robovm.objc.ObjCObject o) {
    synchronized(org.robovm.objc.ObjCObject.objcBridgeLock) {
        long handle = o.getHandle();
        org.robovm.objc.ObjCObject.ObjCObjectRef ref = org.robovm.objc.ObjCObject.peers.remove(handle);
        org.robovm.objc.ObjCObject p = (ref != null) ? ref.get() : null;
        if ((p != null) && (o != p)) {
            org.robovm.objc.ObjCObject.peers.put(handle, new org.robovm.objc.ObjCObject.ObjCObjectRef(p));
        }
    }
}