protected void writeFlagsToCache(@org.jetbrains.annotations.NotNull
com.intellij.openapi.fileTypes.impl.VirtualFile file, int flags) {
    java.io.DataOutputStream stream = autoDetectedAttribute.writeAttribute(file);
    try {
        try {
            stream.writeByte(flags);
        } finally {
            stream.close();
        }
    } catch (java.io.IOException e) {
        com.intellij.openapi.fileTypes.impl.FileTypeManagerImpl.LOG.error(e);
    }
}