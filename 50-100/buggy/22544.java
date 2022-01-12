public byte[] getByteCode(java.lang.Class<?> clazz) {
    java.lang.String filePath = com.kiselev.reflection.ui.impl.bytecode.utils.ClassFileUtils.getFilePath(clazz);
    if (!(filePath.isEmpty())) {
        return null;
    }
    if (com.kiselev.reflection.ui.impl.bytecode.utils.ClassFileUtils.isArchive(filePath)) {
        return getByteCodeFromJar(filePath);
    }else {
        return getByteCodeFromFile(filePath);
    }
}