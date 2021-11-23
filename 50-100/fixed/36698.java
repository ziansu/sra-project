private org.objectweb.asm.Handle retargetHandle(org.objectweb.asm.Handle oldHandle) {
    int tag = oldHandle.getTag();
    java.lang.String owner = oldHandle.getOwner();
    java.lang.String name = oldHandle.getName();
    java.lang.String desc = oldHandle.getDesc();
    owner = renameRetargetIfNecessary(owner);
    desc = renameRetargetIfNecessary(desc);
    org.objectweb.asm.Handle newHandle = new org.objectweb.asm.Handle(tag, owner, name, desc);
    return newHandle;
}