public boolean process(java.lang.Iterable<com.oneliang.tools.builder.base.ChangedFile> changedFileIterable) {
    for (com.oneliang.tools.builder.base.ChangedFile changedFile : changedFileIterable) {
        com.oneliang.tools.builder.test.TestCacheHandler.logger.debug(((((("status:" + (changedFile.status)) + ",key:") + (changedFile.key)) + ",path:") + (changedFile.fullFilename)));
    }
    return true;
}