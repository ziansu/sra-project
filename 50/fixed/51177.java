private static java.lang.String newFile() {
    com.fournodes.ud.locationtest.utils.FileLogger.LOG_FILE_NAME = (com.fournodes.ud.locationtest.utils.FileLogger.LOG_FILE_PREFIX) + (com.fournodes.ud.locationtest.utils.FileLogger.df.format(java.util.Calendar.getInstance().getTime()));
    return (com.fournodes.ud.locationtest.utils.FileLogger.LOG_FILE_NAME) + (com.fournodes.ud.locationtest.utils.FileLogger.LOG_FILE_EXT);
}