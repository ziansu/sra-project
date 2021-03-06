private java.lang.String transformDescriptor(org.spongepowered.asm.lib.Type type) {
    if ((type.getSort()) == (org.spongepowered.asm.lib.Type.METHOD)) {
        return this.transformMethodDescriptor(type.getDescriptor());
    }
    return this.transformSingleDescriptor(type);
}