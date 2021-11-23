public void deleteOneRecordByID(com.backend.FileInfo fi) {
    if ((fi == null) || (org.apache.commons.lang.StringUtils.isBlank(fi.getHash256()))) {
        com.backend.BaseSqliteStore.logger.warn("input file's path is empty.");
        return ;
    }
    deleteRecord(fi.getHash256(), false);
}