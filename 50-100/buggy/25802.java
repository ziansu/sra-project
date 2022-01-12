@java.lang.Override
public void visitBaseType(char descriptor) {
    if (isReturn) {
        java.lang.String prefix = (isArray) ? "[" : "";
        isArray = false;
        item.name = prefix + descriptor;
        item.length = jaop.gradle.plugin.asm.ASMHelper.getTypeLength(item.name);
    }
    super.visitBaseType(descriptor);
}