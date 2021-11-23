public boolean isFileIgnored(final mobi.hsz.idea.gitignore.VirtualFile file) {
    return (isEnabled()) && ((isParentIgnored(file)) || (cache.isFileIgnored(file)));
}