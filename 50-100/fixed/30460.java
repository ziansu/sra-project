private void addToTags(java.util.Map<java.lang.String, java.util.Set<se.bjurr.gitchangelog.internal.git.model.GitCommit>> commitsPerTag, java.lang.String tagName, java.util.List<se.bjurr.gitchangelog.internal.git.model.GitTag> addTo) {
    if (commitsPerTag.containsKey(tagName)) {
        java.util.Set<se.bjurr.gitchangelog.internal.git.model.GitCommit> gitCommits = commitsPerTag.get(tagName);
        se.bjurr.gitchangelog.internal.git.model.GitTag gitTag = new se.bjurr.gitchangelog.internal.git.model.GitTag(tagName, com.google.common.collect.Lists.newArrayList(gitCommits));
        addTo.add(gitTag);
    }
}