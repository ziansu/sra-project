public void deleteIndex() throws java.lang.Exception {
    indexService.removeIndex(indexName);
    for (int i = 0; i < (numberOfShards); i++) {
        {
            java.nio.file.Path p = getPathForIndex(i);
            java.nio.file.Files.walkFileTree(p, new io.zulia.server.util.DeletingFileVisitor());
        }
        {
            java.nio.file.Path p = getPathForFacetsIndex(i);
            java.nio.file.Files.walkFileTree(p, new io.zulia.server.util.DeletingFileVisitor());
        }
    }
    documentStorage.drop();
}