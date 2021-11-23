@java.lang.Override
public org.mariotaku.patchlib.common.asm.MethodVisitor visitMethod(int access, java.lang.String name, java.lang.String desc, java.lang.String signature, java.lang.String[] exceptions) {
    if ((classInfo) != null) {
        org.mariotaku.patchlib.common.model.PatchClassInfo.PatchMethodInfo fieldInfo = classInfo.getMethodInfo(name);
        java.lang.System.out.printf("Processing method %s\n", name);
        if (fieldInfo != null) {
            access = fieldInfo.processModifiers(access);
            exceptions = fieldInfo.processExceptions(exceptions);
        }
    }
    return super.visitMethod(access, name, desc, signature, exceptions);
}