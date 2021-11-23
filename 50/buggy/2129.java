public static void logInfo(org.apache.log4j.Logger logger, java.lang.String info) {
    if (br.ufpe.cin.aac3.gryphon.GryphonConfig.isLogEnabled())
        logger.info(info);
    
}