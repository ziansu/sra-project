public void deleteOneRecordByPath(com.backend.FileInfo fi) {
    if ((fi == null) || (org.apache.commons.lang.StringUtils.isBlank(fi.getPath()))) {
        com.backend.BaseSqliteStore.logger.warn("input file's path is empty.");
        return ;
    }
    deleteRecord(fi.getPath(), true);
}