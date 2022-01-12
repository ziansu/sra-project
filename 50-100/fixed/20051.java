private void deleteFolder(java.lang.String site, java.lang.String path, java.lang.String user) {
    if (contentService.contentExists(site, path)) {
        org.craftercms.studio.api.v1.repository.RepositoryItem[] children = contentRepository.getContentChildren(site, path);
        if ((children.length) < 1) {
            contentService.deleteContent(site, path, false, user);
            java.lang.String parentPath = org.craftercms.studio.impl.v1.util.ContentUtils.getParentUrl(path);
            deleteFolder(site, parentPath, user);
        }
    }
}