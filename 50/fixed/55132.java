@java.lang.Override
@org.jetbrains.annotations.Nullable
public com.intellij.openapi.fileTypes.impl.FileType getKnownFileTypeOrAssociate(@org.jetbrains.annotations.NotNull
com.intellij.openapi.fileTypes.impl.VirtualFile file) {
    com.intellij.openapi.fileTypes.impl.FileType type = file.getFileType();
    if (type != (UnknownFileType.INSTANCE))
        return type;
    
    return com.intellij.openapi.fileTypes.impl.FileTypeChooser.getKnownFileTypeOrAssociate(file.getName());
}