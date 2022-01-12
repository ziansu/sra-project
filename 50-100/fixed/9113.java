public void update(S entry) {
    this.setDescription(entry.getDescription());
    lastModified = entry.getLastModified();
    this.setAuthor(entry.getAuthor());
    if (!(entry.getGitUrl().isEmpty())) {
        gitUrl = entry.getGitUrl();
    }
}