@java.lang.Override
public java.lang.Boolean delete(java.lang.String fileName) {
    try {
        boolean success = new java.io.File(fileName).delete();
        if (!success) {
            log.error("fail to delete file {}", fileName);
            throw new my.yrzy.common.exception.ServiceException("file.delete.fail");
        }
        return true;
    } catch (java.lang.Exception e) {
        log.error("fail to delete file {}, cause:{}", fileName, com.google.common.base.Throwables.getStackTraceAsString(e));
        throw new my.yrzy.common.exception.ServiceException("file.delete.fail");
    }
}