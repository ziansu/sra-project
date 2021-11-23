public void removeFile(java.lang.String fullyQualifiedName) {
    files.remove(fullyQualifiedName.toUpperCase());
    superfiles.remove(fullyQualifiedName.toLowerCase());
}