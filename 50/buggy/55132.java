@java.lang.Override
@org.jetbrains.annotations.Nullable
public com.intellij.openapi.fileTypes.impl.FileType getKnownFileTypeOrAssociate(@org.jetbrains.annotations.NotNull
com.intellij.openapi.fileTypes.impl.VirtualFile file) {
    com.intellij.openapi.fileTypes.impl.FileType type = file.getFileType();
    if (type == (UnknownFileType.INSTANCE)) {
        type = com.intellij.openapi.fileTypes.impl.FileTypeChooser.associateFileType(file.getName());
    }
    return type;
}