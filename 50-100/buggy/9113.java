public void update(S entry) {
    this.setDescription(entry.getDescription());
    isPublished = entry.getIsPublished();
    lastModified = entry.getLastModified();
    this.setAuthor(entry.getAuthor());
    if (!(entry.getGitUrl().isEmpty())) {
        gitUrl = entry.getGitUrl();
    }
}