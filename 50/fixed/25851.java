private static boolean isDynamicCreateClass(java.lang.Class<?> clazz) {
    return (com.kiselev.reflection.ui.impl.bytecode.utils.ClassFileUtils.getFilePath(clazz)) == null;
}