public void updateDirectories(java.util.List<io.github.qwefgh90.handyfinder.lucene.model.Directory> list) throws java.sql.SQLException {
    if ((getDirectories().size()) != (list.size())) {
        indexProperty.save(list);
        java.util.concurrent.CompletableFuture<java.lang.Boolean> f = handler.restartIndexAsync(list);
        f.exceptionally(( exception) -> {
            io.github.qwefgh90.handyfinder.springweb.service.RootService.LOG.error(("To update indexes failed " + (org.apache.commons.lang.exception.ExceptionUtils.getStackTrace(exception))));
            return true;
        });
    }
}