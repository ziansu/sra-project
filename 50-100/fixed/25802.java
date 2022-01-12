@java.lang.Override
public void visitBaseType(char descriptor) {
    if (isReturn) {
        java.lang.String prefix = (isArray) ? "[" : "";
        item.name = prefix + descriptor;
        item.length = jaop.gradle.plugin.asm.ASMHelper.getTypeLength(item.name);
    }
    isArray = false;
    super.visitBaseType(descriptor);
}