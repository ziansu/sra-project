private javax.swing.ImageIcon getFileIcon(@org.jetbrains.annotations.NotNull
jet.task.previewer.api.DirectoryElement directoryElement) {
    java.lang.String filenameExtension = jet.task.previewer.common.FileSystemUtils.getFilenameExtension(directoryElement.getName().toLowerCase());
    return extensionIcons.containsKey(filenameExtension) ? extensionIcons.get(filenameExtension) : fileIcon;
}