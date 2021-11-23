public java.lang.String getFileContent(java.lang.String repoUser, java.lang.String repo, java.lang.String branch, java.lang.String path) throws java.lang.Exception {
    org.json.JSONObject json = getFile(repoUser, repo, branch, path);
    return GitHub.decodeBase64(json.getString("content"));
}