public static void logError(org.apache.log4j.Logger logger, java.lang.String error) {
    if (br.ufpe.cin.aac3.gryphon.GryphonConfig.isLogEnabled())
        logger.error(error);
    
}