public java.net.URI getProcessBaseUriForExistingProcess(java.lang.Process process) {
    java.lang.String path = process.getId().toString();
    path = (path.replaceAll(" ", "__")) + "/";
    return java.net.URI.create(path);
}