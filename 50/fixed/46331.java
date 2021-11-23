public boolean isParentIgnored(final mobi.hsz.idea.gitignore.VirtualFile file) {
    return (isEnabled()) && (cache.isParentIgnored(file));
}