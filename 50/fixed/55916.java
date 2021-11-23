@org.jetbrains.annotations.Contract(pure = true)
private boolean isSynthetic() {
    return ((this.access) & (Opcodes.ACC_SYNTHETIC)) == (Opcodes.ACC_SYNTHETIC);
}