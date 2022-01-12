private org.spongepowered.asm.lib.Handle transformHandle(org.spongepowered.asm.mixin.transformer.MethodNode method, java.util.Iterator<org.spongepowered.asm.mixin.transformer.AbstractInsnNode> iter, org.spongepowered.asm.lib.Handle handle) {
    this.targetClass.version = org.spongepowered.asm.util.Constants.JAVA8_CLASSFILE_VERSION;
    org.spongepowered.asm.mixin.transformer.MemberRef.HandleRef memberRef = new org.spongepowered.asm.mixin.transformer.MemberRef.HandleRef(handle);
    if (memberRef.isField()) {
        this.transformFieldRef(method, iter, memberRef);
    }else {
        this.transformMethodRef(method, iter, memberRef);
    }
    return memberRef.getMethodHandle();
}