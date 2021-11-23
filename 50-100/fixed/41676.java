private void validateFolderPermission(java.lang.String fullPath, java.lang.String email) throws com.mannawardproject.exceptions.ValidationException, java.io.IOException {
    java.lang.String userFolderPath = new java.io.File(((((rootDirectory) + (java.io.File.separator)) + email) + (java.io.File.separator))).getCanonicalPath();
    java.lang.String canonicalPath = new java.io.File(fullPath).getCanonicalPath();
    if (!(canonicalPath.startsWith(userFolderPath))) {
        throw new com.mannawardproject.exceptions.ValidationException("You haven't permissions on this folder!");
    }
}