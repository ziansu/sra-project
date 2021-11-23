public void retrieveFiles(java.lang.String localPath, java.lang.String remotePath) throws java.lang.Exception {
    java.lang.String filesToBeGet = getParameter("RETRIEVE_FILES");
    retrieveFiles(filesToBeGet.split(";"), localPath, remotePath);
}