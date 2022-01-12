public com.hea3ven.tools.asmtweaks.editors.MethodEditor fieldInsn(int opcode, java.lang.String owner, java.lang.String name, java.lang.String desc) {
    com.hea3ven.tools.mappings.FldMapping fld = getField(name, desc);
    mode.apply(new com.hea3ven.tools.asmtweaks.editors.FieldInsnNode(opcode, getClass(owner).getPath(((obfuscation) != (ObfuscationMode.SRG) ? getActualObfuscation() : false)), fld.getName(getActualObfuscation()), getDesc(desc)));
    return this;
}