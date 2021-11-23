public byte[] transformForgeHooks(byte[] bytes) {
    micdoodle8.mods.miccore.ClassNode node = this.startInjection(bytes);
    micdoodle8.mods.miccore.MicdoodleTransformer.operationCount = 1;
    micdoodle8.mods.miccore.MethodNode method = this.getMethod(node, micdoodle8.mods.miccore.MicdoodleTransformer.KEY_METHOD_BED_ORIENT_CAMERA);
    if (method != null) {
        method.instructions.insertBefore(method.instructions.get(0), new micdoodle8.mods.miccore.MethodInsnNode(org.objectweb.asm.Opcodes.INVOKESTATIC, micdoodle8.mods.miccore.MicdoodleTransformer.CLASS_MICDOODLE_PLUGIN, "orientCamera", "()V"));
        (micdoodle8.mods.miccore.MicdoodleTransformer.injectionCount)++;
    }
    return this.finishInjection(node);
}