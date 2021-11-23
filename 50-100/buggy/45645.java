private void fetchChange(com.google.gerrit.extensions.common.RevisionInfo revisionInfo, com.urswolfer.intellij.plugin.gerrit.git.RevisionFetcher.FetchCallback fetchCallback) {
    com.google.gerrit.extensions.common.FetchInfo fetchInfo = gerritUtil.getFirstFetchInfo(revisionInfo);
    if (fetchInfo == null) {
        notifyError();
    }else {
        java.lang.String ref = fetchInfo.ref;
        java.lang.String url = fetchInfo.url;
        gerritGitUtil.fetchChange(project, gitRepository, url, ref, fetchCallback);
    }
}