private boolean isJavaFile(final org.eclipse.core.resources.IFile file) {
    final java.lang.String fileExtension = file.getFileExtension();
    if (fileExtension == null)
        return false;
    
    return (fileExtension.equals("java")) || (fileExtension.equals("jak"));
}